package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1=input.nextInt();
		System.out.println("Enter second number: ");
		int number2=input.nextInt();
		System.out.println("Enter third number: ");
		int number3=input.nextInt();
		
		if(number1 > number2) {
			if(number1 > number3) {
				System.out.println(number1 +" is the greatest no.");
			}else {
				System.out.println(number3 +" is the greatest no.");
			}
		}
		else {
			if(number2 > number3) {
				System.out.println(number2 +" is the greatest no.");
			}
			else {
				System.out.println(number3 +" is the greatest no.");
			}
		}
	}

}
