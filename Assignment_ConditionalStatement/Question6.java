//Take values of length and breadth of a rectangle from user and check if it is square or not.

package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner s = new Scanner(System.in);
		    System.out.print("Enter length: ");
		    int x = s.nextInt();
		    System.out.print("Enter breadth: ");
		    int y = s.nextInt();
		    if(x==y){
		      System.out.println("Square");
		    }
		    else{
		      System.out.println("Rectangle");
		    }
	}

}
