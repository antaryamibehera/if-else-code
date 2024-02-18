package com.array;

public class Sum3 {

	public static void main(String[] args) {
		int target=0;
		int a[] = { -1, 0, 1, 2, -1, -4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					if (a[i] != a[j] && a[i] != a[k] && a[j] != a[k]) {
						if(a[i]+a[j]+a[k]==target) {
							System.out.println(a[i]+" "+a[j]+" "+a[k]);
						}
					}
				}
			}
		}

	}

}
