package com.sortalgo.FirstSpring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sama")
public class Same implements sortalgorithm {

	public int[] sort(int[] arr) {
		return arr;

	}

}
