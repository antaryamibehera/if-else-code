package com.evenodd;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("This is Even Number :"+a);
		}
		else {
			System.out.println("This is Odd Number :"+a);
		}

	}

}
