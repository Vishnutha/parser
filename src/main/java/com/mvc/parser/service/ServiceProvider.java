package com.mvc.parser.service;
//import com.github.javaparser.*;
  import com.github.javaparser.*;
  import com.github.javaparser.ast.CompilationUnit;
  import com.github.javaparser.ast.Node;
  import com.github.javaparser.ast.NodeList;
  import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
  import com.github.javaparser.ast.body.FieldDeclaration;
  import com.github.javaparser.ast.body.MethodDeclaration;
  import com.github.javaparser.ast.comments.Comment;
  import com.github.javaparser.ast.expr.AnnotationExpr;
  import com.github.javaparser.ast.expr.MethodCallExpr;
  import com.github.javaparser.ast.stmt.BlockStmt;
  import com.github.javaparser.ast.stmt.Statement;
  import org.jetbrains.annotations.NotNull;

  import javax.swing.plaf.nimbus.State;
  import java.io.File;
  import java.io.IOException;
  import java.nio.file.Files;
  import java.nio.file.Paths;
  import java.sql.SQLOutput;
  import java.util.ArrayList;
  import java.util.List;
  import java.util.Optional;
  import java.util.concurrent.atomic.AtomicReference;

public class ServiceProvider {

  void printComments(CompilationUnit cu) {
    List<Comment> commentList = new ArrayList<>();
    commentList = cu.getAllComments();
    for (Comment a : commentList) {
      System.out.println(a.asString());
    }
  }

  String getFileName(String path) {
    StringBuilder revFileName = new StringBuilder();
    for (int i = path.length() - 1 - getExtension().length(); i >= 0; i--)
    {
      if (path.charAt(i) == '/') break;
      else revFileName.append(path.charAt(i));
    }
    revFileName.reverse();
    return revFileName.toString();

  }

  String getExtension() {
    return ".java";// currently works only for .java files
  }
  String removeExtension(String fileName)
  {
    for(int i = fileName.length()-1;i>= 0;i--)
    {
      if(fileName.charAt(i) == '.') return fileName.substring(0,i);
    }
    return "unknown";
  }

  String getPathWithoutFileName(String path) {
//    StringBuilder pathWithoutFileName = new StringBuilder();
    String pathWithoutFileName = " ";
    for(int i = path.length()-1; i >= 0 ; i--)
    {
      if(path.charAt(i) == '/' && i != 0)
      {
        pathWithoutFileName = path.substring(0,i+1);
        break;
      }
    }
    return pathWithoutFileName;
  }
  AtomicReference<Boolean>  isFieldAnnotationPresent(CompilationUnit cu2,String tableName,String annotation)
  {
    AtomicReference<Boolean> version = new AtomicReference<>(false);
//    Optional<ClassOrInterfaceDeclaration> tableDeclaration = cu2.getClassByName(tableName);
    cu2.getClassByName(tableName).ifPresent(table ->{
      List<FieldDeclaration> fields;
      fields = table.getFields();
      fields.forEach(field ->{
        NodeList<AnnotationExpr> annotationExprNodeList = field.getAnnotations();
        for (AnnotationExpr expr : annotationExprNodeList) {
          if (expr.getName().toString().equals(annotation)) {
            version.set(true);
            break;
          }
        }
      });
    });

    return  version;
  }

  public void checkVersionRuleForARepositoryFile(@NotNull File file) throws IOException {
    String path = file.getAbsolutePath();
    String fileName = removeExtension(file.getName());
    CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(path)));
    Optional<ClassOrInterfaceDeclaration> interfaceByName = cu.getInterfaceByName(fileName);

    if (!interfaceByName.isEmpty()) {
      String declaration = interfaceByName.toString();
      String tableName = getTableName(declaration);
      String pathWithoutFileName = getPathWithoutFileName(path);
      String tablePath = pathWithoutFileName + tableName + getExtension();
      //TODO: constraint it can only generate the path which is place in the same directory
      CompilationUnit cu2 = StaticJavaParser.parse(Files.newInputStream(Paths.get(tablePath)));
      AtomicReference<Boolean> isVersionPresent = isFieldAnnotationPresent(cu2,tableName,"Version");

      if(isVersionPresent.get() == false)
      {
        System.out.println("Version annotation is absent in the file : " + fileName);
        System.out.println("Potential Data Race Situation");
      }
      else
      {
        System.out.println("Rule 1 satisfied,Version annotation is present in the file: "+ fileName);
      }

    }
    else
      System.out.println("Not a proper repository");

  }
  public ArrayList<File> getRepositoryFiles(File[] fileList)
  {
    ArrayList<File> RequiredFileList = new ArrayList<>();
    for(File file : fileList)// Required file list keeps track of all the files which are repositories
    {
      String fileName = file.getName();
      if(fileName.toLowerCase().contains("repository"))// contains repository
      {
        RequiredFileList.add(file);
      }
    }
    return RequiredFileList;
  }
  public void checkVersionRuleInADirectory() throws IOException {
    File[] fileList = getFilesInDirectory("/home/vishnutha/parser/src/main/resources/ftgo-order-service/src/main/java/net/chrisrichardson/ftgo/orderservice/domain");
    ArrayList<File> repositoryFiles = getRepositoryFiles(fileList);
    for (File file : repositoryFiles) {
      checkVersionRuleForARepositoryFile(file);
    }
  }
  public File[] getFilesInDirectory(String directoryPath)
  {
    File directoryPathF = new File(directoryPath);
    File fileList[] = directoryPathF.listFiles();
    return fileList;
  }
  public void checkForTransactionalAnnotation(String directoryPath) throws IOException
  {

      File[] fileList = getFilesInDirectory(directoryPath);
      String[] keywords = {"save","publish"};
      for(File file : fileList)
      {
        //TODO: check Transactional annotation for classes.
        checkAMethodAnnotationWithKeywords("Transactional",file,keywords);
      }
  }
  public void checkRetryable(String directoryPath) throws IOException
  {
    File[] fileList = getFilesInDirectory(directoryPath);
    String[] keywords = {"publish"};// TODO: Enter the keywords for the Retryable annotation.
    for(File file : fileList)
    {
      checkAMethodAnnotationWithKeywords("Retryable",file,keywords);
    }
  }
  private void checkAMethodAnnotationWithKeywords(String annotation , File file , String[] keywords) throws IOException
  {
    CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(file.getAbsolutePath())));
    String fileName = removeExtension(file.getName());
    Optional<ClassOrInterfaceDeclaration> classDeclaration = cu.getClassByName(fileName);
    cu.findAll(MethodCallExpr.class).forEach(methodCallExpr -> {
      for (String keyword : keywords) {
        if (keyword.equals(methodCallExpr.getNameAsString())) {
          System.out.println("Method call to \" " + keyword + " \" found in method: " + getMethodName(methodCallExpr));
          String methodName = getMethodName(methodCallExpr);
          AtomicReference<Boolean> isAnnotationPresent = new AtomicReference<>();
          classDeclaration.ifPresent(classDeclaration1 -> {
            List<MethodDeclaration> s = classDeclaration1.getMethodsByName(methodName);
            s.forEach(method -> {
              Optional<AnnotationExpr> annotationExpr = method.getAnnotationByName(annotation);
              isAnnotationPresent.set(annotationExpr.isPresent());
            });
            if (isAnnotationPresent.get())
              System.out.println( "@" + annotation + " annotation is present in the method " + methodName + " in the file " + fileName);
            else {
              System.out.println( "@" + annotation +" annotation is \" not \" present in the method " + methodName + " in the file "+ fileName);
            }
          });
          if (classDeclaration.isEmpty()) {
            System.out.println("No class declaration with file name " + file.getName());
          }
        }}});
  }
  public String getMethodName(Node node)
  {
    Node parent = node.getParentNode().orElse(null);
    if (parent instanceof MethodDeclaration) {
      return ((MethodDeclaration) parent).getNameAsString();
    } else if (parent != null) {
      return getMethodName(parent);
    }
    return "Unknown";
  }

  String getTableName(@NotNull String declaration) {
    String tableName = "";
    for (int i = 0; i < declaration.length(); i++) {
      if (declaration.charAt(i) == '<') {
        int j = i + 1;
        for (; j < declaration.length(); j++) {
          if (declaration.charAt(j) == ',')
            break;
          else {
            if (declaration.charAt(j) != ' ')
              tableName += declaration.charAt(j);
          }
        }
        break;
      }

    }
    return tableName;
  }

}