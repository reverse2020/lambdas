package com.example.study;

import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
	}

	public void run(String... arg0) throws Exception {
		System.out.println("Hello world from Command Line Runner");
        IntStream stream = IntStream.of(-9, -18, 54, 8, 7, 14, 3,-99); 

        System.out.println(stream.min().getAsInt());
        System.out.println(IntStream.of(-9, -18, 54, 8, 7, 14, 3,-99).max().getAsInt());

	}
}
