package com.sortalgo.FirstSpring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ApplicationContext Appcont = SpringApplication.run(FirstSpringApplication.class, args);

		BinarySearchImpl Binarysearch = Appcont.getBean(BinarySearchImpl.class);
		BinarySearchImpl Binarysearch1 = Appcont.getBean(BinarySearchImpl.class);
		System.out.println(Binarysearch);
		System.out.println(Binarysearch1);

		int result = Binarysearch.BinarySearch(new int[] { 12, 4, 3, 44, 31, 34 }, 45);
		System.out.println(result);

	}

}
