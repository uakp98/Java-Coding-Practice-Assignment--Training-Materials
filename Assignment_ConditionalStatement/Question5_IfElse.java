package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question5_IfElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter number to check it's Even or Odd: ");
	    
	    int number=s.nextInt();
	    
	    if(number%2 == 0) {
	    	System.out.println("Even No.");
	    }else {
	    	System.out.println("Odd No.");
	    }
	}
}
