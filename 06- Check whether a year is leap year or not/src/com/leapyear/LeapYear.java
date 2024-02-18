package com.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		boolean red = false;
		if (year % 400 == 0) {
			red = true;
		} else if (year % 100 == 0) {
			red = false;
		}
		else {
			red= false;
		}
		if(red) {
			System.out.println("This is leap year : "+year);
		}
		else {
			System.out.println("This is not leap year : "+year);
		}*/

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Year------>");
		int yr=s.nextInt();
		if(yr%400==0 || yr%4==0) {
			System.out.println("This is leap year :"+yr);
		}
		else {
			System.out.println("This is not leap year :"+yr);
		}
	}
}