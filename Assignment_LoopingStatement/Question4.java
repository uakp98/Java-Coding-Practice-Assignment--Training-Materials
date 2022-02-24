package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		while(true) {
			System.out.print("Enter a number ");
			sum +=sc.nextInt();
			if(sum > 100) {
				break;
			}
		}
		System.out.println("Done "+sum);
	}

}
