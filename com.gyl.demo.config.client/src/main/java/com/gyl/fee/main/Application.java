package com.gyl.fee.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan(basePackages = { "com.gyl.fee.mss" })
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@RefreshScope
@RestController
class MessageRestController1 {

	@Value("${message}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}
}
