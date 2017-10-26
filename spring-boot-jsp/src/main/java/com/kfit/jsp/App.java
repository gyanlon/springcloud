package com.kfit.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.kfit.jsp.controller" })
@SpringBootApplication
@EnableDiscoveryClient
public class App extends SpringBootServletInitializer {

	// @Override

	// protectedSpringApplicationBuilder configure(SpringApplicationBuilder
	// application) {

	// returnapplication.sources(App.class);

	// }

	public static void main(String[] args) {

              SpringApplication.run(App.class,args);

       }

}