package de.imker;

import com.jpomykala.springhoc.cors.EnableCORS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCORS
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
