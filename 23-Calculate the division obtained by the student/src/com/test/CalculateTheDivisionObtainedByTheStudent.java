package com.test;

import java.util.Scanner;

public class CalculateTheDivisionObtainedByTheStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
		int mark = sc.nextInt();
		if(mark>=60) {
			System.out.println("First division");
		}
		else if(mark<=59 && mark>=50) {
			System.out.println(" Second division");
		}
		else if(mark<=40 && mark>=49) {
			System.out.println("Third division");
		}
		else {
			System.out.println("Fail");
		}

	}

}
