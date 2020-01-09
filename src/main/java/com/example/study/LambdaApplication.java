package com.example.study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
	}

	 public void run(String... arg0) throws Exception {
	      System.out.println("Hello world from Command Line Runner");
	   }
}
