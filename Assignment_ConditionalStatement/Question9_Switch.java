package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question9_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Add \n2. Subtraction \n3. Multiplication \n4. Division");
		System.out.println("Choose a number from the Above option- ");
		
		int operation=sc.nextInt();
		double d1, d2;
		switch(operation) {
		case 1:
			System.out.print("Enter first number: ");
			d1=sc.nextDouble();
			
			System.out.print("Enter Second number: ");
			d2=sc.nextDouble();
			
			System.out.println("Add Result: "+ (d1+d2));
			break;
		case 2:
			System.out.print("Enter first number: ");
			d1=sc.nextDouble();
			
			System.out.print("Enter Second number: ");
			d2=sc.nextDouble();
			
			System.out.println("Subtraction Result: "+ (d1-d2));
			break;
		case 3:
			System.out.print("Enter first number: ");
			d1=sc.nextDouble();
			
			System.out.print("Enter Second number: ");
			d2=sc.nextDouble();
			
			System.out.println("Multiplication Result: "+ (d1*d2));
			break;
		case 4:
			System.out.print("Enter first number: ");
			d1=sc.nextDouble();
			
			System.out.print("Enter Second number: ");
			d2=sc.nextDouble();
			
			System.out.println("Division Result: "+ (d1/d2));
			break;
		default:
			System.out.println("Choose a wrong option.. \n Type a correct one..");
				
		}
		
	}

}
