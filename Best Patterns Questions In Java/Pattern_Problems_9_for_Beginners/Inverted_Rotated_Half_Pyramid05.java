package com.Pattern_Problems_9_for_Beginners;

public class Inverted_Rotated_Half_Pyramid05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
