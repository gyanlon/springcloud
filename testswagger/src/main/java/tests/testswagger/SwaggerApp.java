package tests.testswagger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SwaggerApp extends SpringBootServletInitializer {

  public static void main(String[] args) {
    new SpringApplicationBuilder(SwaggerApp.class).web(true).run(args);
  }
}
