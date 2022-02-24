package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question5_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter number to check it's Even or Odd: ");
	    
	    int number=s.nextInt();
	    
	    switch(number%2) {
	    case 0:
	    	System.out.println("Even No.");
	    	break;
	    case 1:
	    	System.out.println("Odd No.");
	    	break;
	    default:
	    	System.out.println("Invalid..");
	    }
	}

}
