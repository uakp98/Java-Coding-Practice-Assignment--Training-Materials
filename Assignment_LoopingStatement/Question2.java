package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int sum = 0;
	    for(int i = 0; i<10;i++){
	      System.out.println("Enter a number");
	      sum = sum+s.nextInt();
	    }
	    int avg=sum/10;
	    System.out.println("Sum is "+sum);
	    System.out.println("Average is "+avg);
	  }
}
