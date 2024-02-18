package com.array;

public class Array01 {

	public static void main(String[] args) {
		int a[] = { 3, 7, 11, 2 ,6};
		int sum = 0;
		int count=1;
		int target = 9;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum = a[i] + a[j];
				if (sum == target) {
					System.out.println(a[i] +" "+ a[j]);
					System.out.println("Count is "+count++);
				}
			}

		}

	}

}
