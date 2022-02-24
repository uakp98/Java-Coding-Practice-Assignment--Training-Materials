package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1=input.nextInt();
		
		System.out.print("Enter second number: ");
		int number2=input.nextInt();
		
		if(number1 > number2) {
			System.out.println(number1+ " is the greatest number");
		}
		else {
			System.out.println(number2+ " is the greatest number");
		}
	}

}
