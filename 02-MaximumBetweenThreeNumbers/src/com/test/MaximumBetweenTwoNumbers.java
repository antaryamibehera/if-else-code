package com.test;

public class MaximumBetweenTwoNumbers {

	public static void main(String[] args) {
		int a =10,b=200,c=30;
		if(a<b&&c<b) {
			System.out.println(b+" is greater than "+a+" , "+c);
		}
		else if (b<a&&c<a) {
			System.out.println(a+" is greater than "+b+" , "+c);
		}
		else {
			System.out.println(c+" is greater than "+a+" , "+b);
		}

	}

}
