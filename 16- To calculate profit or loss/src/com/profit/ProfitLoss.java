package com.profit;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CP & SP");
		int CP = sc.nextInt();
		int SP = sc.nextInt();
		int profit ,loss;
		if(CP<SP) {
			profit=SP-CP;
			System.out.println("The profit is : "+profit);
		}
		else if(CP>SP){
			loss=CP-SP;
			System.out.println("The Loss is : "+loss);	
		}else {
			System.out.println("There is no profit or loss");
		}
	}
}
