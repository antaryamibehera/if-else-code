package com.basic;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary :");
		int Basic_Salary = sc.nextInt();
		
		if(Basic_Salary<1500) {
			double HRA=Basic_Salary*0.1;
			System.out.println("HRA is :"+HRA);
			double DA=Basic_Salary*0.9;
			System.out.println("DA is :"+DA);
		}
		else  {
			System.out.println("HRA :"+500);
			double DA=Basic_Salary*0.98;
			System.out.println("DA is :"+DA);
		}

	}

}
