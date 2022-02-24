package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer n-th term ");
		int n=sc.nextInt();
		int result=0;
		int x=0;
		int y=1;
		for(int i=0;i<n-2;i++) {
			result=x+y;
			x=y;
			y=result;
		}
		
		System.out.print(n+"-th term Fibonacci series "+result);
		//System.out.println();
	}

}
