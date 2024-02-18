package com.salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary :");
		int basicsalary = sc.nextInt();
		double hr,da;
		if(basicsalary<=10000) {
			 hr=basicsalary*0.2;
			 da=basicsalary*0.8;
		}
		else if(basicsalary<=20000) {
			 hr=basicsalary*0.25;
			 da=basicsalary*0.9;
		}
		else {
			 hr=basicsalary*0.3;
			 da=basicsalary*0.95;
		}
		System.out.println("HRA :"+hr);
		System.out.println("DA :"+da);
		System.out.println(basicsalary+hr+da);
	}

}
