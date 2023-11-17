package net.chrisrichardson.ftgo.orderservice.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: OrderService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "orderservice.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest,
      net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createOrder",
      requestType = net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest.class,
      responseType = net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest,
      net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest, net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply> getCreateOrderMethod;
    if ((getCreateOrderMethod = OrderServiceGrpc.getCreateOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getCreateOrderMethod = OrderServiceGrpc.getCreateOrderMethod) == null) {
          OrderServiceGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest, net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("createOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest,
      net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelOrder",
      requestType = net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest.class,
      responseType = net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest,
      net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest, net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply> getCancelOrderMethod;
    if ((getCancelOrderMethod = OrderServiceGrpc.getCancelOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getCancelOrderMethod = OrderServiceGrpc.getCancelOrderMethod) == null) {
          OrderServiceGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest, net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("cancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest,
      net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply> getReviseOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reviseOrder",
      requestType = net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest.class,
      responseType = net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest,
      net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply> getReviseOrderMethod() {
    io.grpc.MethodDescriptor<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest, net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply> getReviseOrderMethod;
    if ((getReviseOrderMethod = OrderServiceGrpc.getReviseOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getReviseOrderMethod = OrderServiceGrpc.getReviseOrderMethod) == null) {
          OrderServiceGrpc.getReviseOrderMethod = getReviseOrderMethod =
              io.grpc.MethodDescriptor.<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest, net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reviseOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("reviseOrder"))
              .build();
        }
      }
    }
    return getReviseOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrder(net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     */
    public void cancelOrder(net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }

    /**
     */
    public void reviseOrder(net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest request,
        io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviseOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest,
                net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getCancelOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest,
                net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply>(
                  this, METHODID_CANCEL_ORDER)))
          .addMethod(
            getReviseOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest,
                net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply>(
                  this, METHODID_REVISE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOrder(net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOrder(net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviseOrder(net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest request,
        io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviseOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply createOrder(net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply cancelOrder(net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply reviseOrder(net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviseOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply> createOrder(
        net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply> cancelOrder(
        net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply> reviseOrder(
        net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviseOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORDER = 0;
  private static final int METHODID_CANCEL_ORDER = 1;
  private static final int METHODID_REVISE_ORDER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.CreateOrderReply>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderRequest) request,
              (io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.CancelOrderReply>) responseObserver);
          break;
        case METHODID_REVISE_ORDER:
          serviceImpl.reviseOrder((net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderRequest) request,
              (io.grpc.stub.StreamObserver<net.chrisrichardson.ftgo.orderservice.grpc.ReviseOrderReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.chrisrichardson.ftgo.orderservice.grpc.OrderServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getCreateOrderMethod())
              .addMethod(getCancelOrderMethod())
              .addMethod(getReviseOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
