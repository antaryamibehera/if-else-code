package com.test;

import java.util.Scanner;

public class CalculateTotalElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount :");
		float unit = sc.nextInt();
		float amount,supercharge,bill_amount;
		if(unit<=50) {
			amount=unit*0.05f;
		}else if(unit<=150) {
			amount=unit*0.75f;
		}else if(unit<=250) {
			amount=unit*1.20f;
		}else {
			amount=unit*1.50f;
		}
		supercharge=amount*0.2f;
		bill_amount=supercharge+amount;
		System.out.println("The bill_amount is :"+bill_amount);
	}

}
