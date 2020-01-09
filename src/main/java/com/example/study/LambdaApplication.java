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
        
        // A stream can be used only once.
		/*
		 * “A stream should be operated on (invoking an intermediate or terminal stream
		 * operation) only once. This rules out, for example, “forked” streams, where
		 * the same source feeds two or more pipelines, or multiple traversals of the
		 * same stream. A stream implementation may throw IllegalStateException if it
		 * detects that the stream is being reused.”
		 */        
        System.out.println(IntStream.of(-9, -18, 54, 8, 7, 14, 3,-99).max().getAsInt());

	}
}
