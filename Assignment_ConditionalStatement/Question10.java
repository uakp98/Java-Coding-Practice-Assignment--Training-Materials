/*
 * A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity
		Suppose, one unit will cost 100.
		Judge and print total cost for user.
 */
package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner s = new Scanner(System.in);
		    System.out.print("Enter quantity: ");
		    int x = s.nextInt();
		    if((x*100) > 1000){
		      System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
		    }
		    else{
		      System.out.println("No discount");
		    }
	}

}
