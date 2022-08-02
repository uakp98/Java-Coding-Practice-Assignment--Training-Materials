package com.Pattern_Problems_9_for_Beginners;

public class Triangle_0_1_Triangle09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				int sum=i+j;
				
				if(sum%2 == 0) {	//even
					System.out.print("1 ");
				}
				else {	//odd
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
