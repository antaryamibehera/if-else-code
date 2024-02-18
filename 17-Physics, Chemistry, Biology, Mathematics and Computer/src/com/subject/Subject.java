package com.subject;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here the mark Physics, Chemistry, Biology, Mathematics and Computer");
		int Physics = sc.nextInt();
		int Chemistry = sc.nextInt();
		int Biology = sc.nextInt();
		int Mathematics = sc.nextInt();
		int Computer = sc.nextInt();
		
		int avg=(Physics+Chemistry+Biology+Mathematics+Computer)/5;
		System.out.println(avg);
		
		if(avg>=90) {
			System.out.println("Grade A");
		}else if(avg>=80) {
			System.out.println("Grade B");
		}else if(avg>=70) {
			System.out.println("Grade C");
		}else if(avg>=60) {
			System.out.println("Grade D");
		}else if(avg>=40) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}

	}

}
