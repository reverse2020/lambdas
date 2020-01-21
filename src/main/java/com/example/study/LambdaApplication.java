package com.example.study;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
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

        IntStream.range(0, 1000).parallel().forEach(
        		nbr -> System.out.println(nbr)
        	        
        	);
        
        IntSummaryStatistics intSummaryStatistics 
        = new IntSummaryStatistics(); 

    List<Integer> list 
        = Arrays.asList(10, 20, 30, 40, 50); 
    Iterator<Integer> iterator = list.listIterator(); 
    while (iterator.hasNext()) { 
        // Add the integers to the IntSummaryStatistics object 
        intSummaryStatistics.accept(iterator.next()); 
    }      // Use various methods to obtain the data 
        System.out.println("The count of values is "
                           + intSummaryStatistics.getCount()); 
        System.out.println("The average of values is "
                           + intSummaryStatistics.getAverage()); 
        System.out.println("The sum of values is "
                           + intSummaryStatistics.getSum()); 
        System.out.println("The maximum of values is "
                           + intSummaryStatistics.getMax()); 
        System.out.println("The minimum of values is "
                           + intSummaryStatistics.getMin()); 
        System.out.println("The string representation is"); 
        System.out.println(intSummaryStatistics.toString()); 
	}
}
