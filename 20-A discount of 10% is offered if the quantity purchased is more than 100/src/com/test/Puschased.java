package com.test;

import java.util.Scanner;

public class Puschased {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Quantity :");
		int quantity = sc.nextInt();
		System.out.println("Enter the Price :");
		int price = sc.nextInt();
		int total_price = quantity * price;
		System.out.println("total_price : " + total_price);
		double discount = 0;
		if (total_price > 100) {
			discount =  (total_price * 0.1);
			System.out.println("Discount : " + discount);
			double final_bill = total_price - discount;
			System.out.println("After giving 10% discount :" + final_bill);
		}
		else {
			System.out.println(total_price+" Price is below 100 ,so sorry you can not get any benefits ");
		}

	}

}
