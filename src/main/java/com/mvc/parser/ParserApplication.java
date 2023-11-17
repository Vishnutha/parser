package com.mvc.parser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mvc.parser.service.ServiceProvider;

import java.io.IOException;

@SpringBootApplication
public class ParserApplication {

	public static void main(String[] args) {

		SpringApplication.run(ParserApplication.class, args);
		ServiceProvider serviceProvider = new ServiceProvider();
		try {
			serviceProvider.checkVersionRuleInADirectory();
			serviceProvider.checkForTransactionalAnnotation("/home/vishnutha/parser/src/main/resources/ftgo-order-service/src/main/java/net/chrisrichardson/ftgo/orderservice/domain");
			serviceProvider.checkRetryable("/home/vishnutha/parser/src/main/resources/ftgo-order-service/src/main/java/net/chrisrichardson/ftgo/orderservice/domain");

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
