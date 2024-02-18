package com.year;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Year of Joining Date : ");
		int DOJ = sc.nextInt();
		System.out.println("Enter the Present Year : ");
		int PresentYear = sc.nextInt();
		
		int total_duration=PresentYear-DOJ;
		System.out.println("Total_Duration :"+total_duration);
		if(total_duration>3) {
			System.out.println("Get the Bonus  : "+2500);
		}else {
			System.out.println("There is no bonus !!!");
		}

	}
}
