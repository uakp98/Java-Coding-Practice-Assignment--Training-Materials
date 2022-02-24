package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question9_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double d1=sc.nextDouble();
		System.out.print("Enter the symbol of the operation: ");
		char operator=sc.next().charAt(0);
		System.out.print("Enter Second number: ");
		double d2=sc.nextDouble();
		
		if(operator == '+') {
			System.out.println(d1+d2);
		}else if(operator == '-') {
			System.out.println(d1-d2);
		}else if(operator == '*') {
			System.out.println(d1*d2);
		}else if(operator == '/') {
			System.out.println(d1/d2);
		}
	}

}
