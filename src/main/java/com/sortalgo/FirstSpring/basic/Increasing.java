package com.sortalgo.FirstSpring.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("iai")

public class Increasing implements sortalgorithm {

	public int[] sort(int[] arr) {

		Arrays.sort(arr);
		return arr;

	}
}
