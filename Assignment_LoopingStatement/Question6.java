package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number to check it's prime or not ");
		int n=sc.nextInt();
		
		int sum=1;
		for(int i=2;i<n/2;i++) {
			if(n%i == 0) {
				sum += i;
				
			}
		}
		System.out.println(sum == 1 ? "Prime No" : "Not Prime");
	}

}
