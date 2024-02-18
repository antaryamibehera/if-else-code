package com.tri;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		if (s1 + s2 > s3) {
			if (s1 + s3 > s2) {
				if (s2 + s3 > s1) {
					System.out.println("This is Valid triangle : "+s1+" "+s2+" "+s3);
				} else {
					System.out.println("This is not valid triangle : "+s1+" "+s2+" "+s3);
				}

			} else {
				System.out.println("This is not valid triangle : "+s1+" "+s2+" "+s3);
			}
		} else {
			System.out.println("This is not valid triangle : "+s1+" "+s2+" "+s3);
		}

	}

}
