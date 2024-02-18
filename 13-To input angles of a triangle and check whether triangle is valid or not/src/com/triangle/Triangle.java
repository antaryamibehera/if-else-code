package com.triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the angles");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int sum=180;
		if(sum==a1+a2+a3 &&a1>0 && a2>0 && a3>0) {
			System.out.println("This is a Triangle");
		}
		else {
			System.out.println("This is not a Triangle");
		}

	}

}
