package com.array;

public class Sum4 {

	public static void main(String[] args) {
		int a[] = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					for(int l=0;l<a.length;l++) {
						if(a[i]+a[j]+a[k]+a[l]==target) {
							System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]);
							
						}
						break;
					}
					
				}
			}
		}

	}

}
