package com.array;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateInASortedArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,0,1,1,1,2,2,3,3,4);
		list.stream().sorted().distinct().forEach(System.out::println);
	}
}
