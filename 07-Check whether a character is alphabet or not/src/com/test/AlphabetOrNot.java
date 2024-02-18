package com.test;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Alphabet :");
		char charAt = sc.next().charAt(0);
		if(charAt>='a' && charAt<='z' || charAt>='A' && charAt<='Z') {
			System.out.println("This is alphabet "+charAt);
		}
		else {
			System.out.println("This is not alphabet "+charAt);
		}
	}

}
