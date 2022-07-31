package com.Pattern_Problems_9_for_Beginners;

public class Floyd_Triangle08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int number=1;
		
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=i; j++) {
					
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			
		}
	}

}
