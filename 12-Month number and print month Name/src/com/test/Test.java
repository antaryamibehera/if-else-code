package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here");
		int months = sc.nextInt();
		if(months==1) {
			System.out.println("Jan :"+months);
		}
		else if (months==2) {
			System.out.println("Feb :"+months);
		}
		else if (months==3) {
			System.out.println("March :"+months);
		}
		else if (months==4) {
			System.out.println("April :"+months);
		}
		else if (months==5) {
			System.out.println("May :"+months);
		}
		else if (months==6) {
			System.out.println("June :"+months);
		}
		else if (months==7) {
			System.out.println("July :"+months);
		}
		else if (months==8) {
			System.out.println("Aug :"+months);
		}
		else if (months==9) {
			System.out.println("Sept :"+months);
		}
		else if (months==10) {
			System.out.println("Oct :"+months);
		}
		else if (months==11) {
			System.out.println("Nov :"+months);
		}
		else if(months==12) {
			System.out.println("Dec :"+months);
		}

	}

}
