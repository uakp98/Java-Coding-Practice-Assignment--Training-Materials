package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    System.out.println("Enter a number");
		    int x = s.nextInt();
		    int fact  =  1;
		    for(int i = x; i>=1 ;i--){
		      fact = fact*i;
		    }
		    System.out.println("Factorial is "+fact);
	}

}
