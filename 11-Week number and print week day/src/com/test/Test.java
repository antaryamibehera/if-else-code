package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here");
		int day=sc.nextInt();
		if(day==1) {
			System.out.println("Monday :"+day);
		}
		else if (day==2) {
			System.out.println("Tuesday :"+day);
		}
		else if (day==3) {
			System.out.println("Wednesday :"+day);
		}
		else if (day==4) {
			System.out.println("Thursday :"+day);
		}
		else if (day==5) {
			System.out.println("Friday :"+day);
		}
		else if (day==6) {
			System.out.println("Saturday :"+day);
		}
		else if (day==7){
			System.out.println("Sunday :"+day);
		}

	}

}
