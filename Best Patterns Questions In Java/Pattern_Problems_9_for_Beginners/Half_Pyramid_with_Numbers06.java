package com.Pattern_Problems_9_for_Beginners;

public class Half_Pyramid_with_Numbers06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}

}
