package com.nextgen.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo1ForEach {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach(i -> System.out.println(i));
		
		
		//forEach method needs the object of consumer
		//-> is the Lambda expression
		//A Lambda expression works with only Functional Interfaces @FunctionalInterface
		
		Consumer<Integer> consumer = i -> System.out.println(i);
		list.forEach(consumer);
		
	}

}
