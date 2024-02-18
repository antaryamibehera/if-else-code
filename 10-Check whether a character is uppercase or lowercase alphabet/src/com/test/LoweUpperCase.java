package com.test;

import java.util.Scanner;

public class LoweUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here");
		char charAt = sc.next().charAt(0);
		if(charAt>='a'&& charAt<='z') {
			System.out.println("This is lower case");
		}
		else if(charAt>='A'&& charAt<='Z') {
			System.out.println("This is Upper Case");
		}

	}

}
