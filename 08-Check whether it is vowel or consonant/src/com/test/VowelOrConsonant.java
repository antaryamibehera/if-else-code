package com.test;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char charAt = sc.next().charAt(0);
		if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u' || charAt == 'A'
				|| charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U') {
			System.out.println("This is vowels : "+charAt);
		}
		else {
			System.out.println("This is not vowels");
		}
	}

}
