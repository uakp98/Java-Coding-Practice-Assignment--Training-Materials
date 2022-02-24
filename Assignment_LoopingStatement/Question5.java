package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i == 0) {
				sum+= i;
			}
		}
		System.out.println(sum);
	}

}
