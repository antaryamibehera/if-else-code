package com.math;

public class PalindromeANumber {

	public static void main(String[] args) {
		int no=121;
		int no1=no;
		int rev=0;
		
		while(no!=0) {
			rev=rev*10+no%10;
			no=no/10;
		}
		if(no1==rev) {
			System.out.println(" This is Palindrome a Number " +rev);
		}
		else {
			System.out.println("This is not Palindrome a Number "+rev);
		}
	}

}
