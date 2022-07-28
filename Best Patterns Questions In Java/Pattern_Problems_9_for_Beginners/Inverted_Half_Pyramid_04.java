package com.Pattern_Problems_9_for_Beginners;

public class Inverted_Half_Pyramid_04 {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=n; i>=1;i--) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
