package com.sortalgo.FirstSpring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	@Qualifier("sama")
	private sortalgorithm Same;


	public int BinarySearch(int[] number1, int search) {

		Same.sort(number1);
		System.out.println(Same);
		return number1[2];

	}

}
