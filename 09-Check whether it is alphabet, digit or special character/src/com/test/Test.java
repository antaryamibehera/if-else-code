package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here");
		char charAt = sc.next().charAt(0);
		if(charAt>='a' && charAt<='z'||charAt>='A' && charAt<='Z') {
			System.out.println("It is a alphabet"+charAt);
		}
		else if(charAt>='0' && charAt<='9') {
			System.out.println("It is a number"+charAt);
		}
		else {
			System.out.println("It is special Character");
		}

	}

}
