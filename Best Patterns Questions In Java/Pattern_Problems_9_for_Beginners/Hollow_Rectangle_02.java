package com.Pattern_Problems_9_for_Beginners;

public class Hollow_Rectangle_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m;j++) {
				if(i == 1 || i == n || j == 1 || j == m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
