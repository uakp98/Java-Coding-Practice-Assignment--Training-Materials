package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter a Year to check it's Leap year or Not: ");
	    
	    int year=s.nextInt();
	    
	    if(year%100 == 0) {
	    	if((year%400 == 0) && (year%4 ==0)) {
	    		System.out.println("Leap Year");
	    	}else {
	    		System.out.println("Not a Leap Year");
	    	}
	    }else {
	    	if(year%4 == 0) {
	    		System.out.println("Leap Year");
	    	}else {
	    		System.out.println("Not a Leap Year");
	    	}
	    }
	}

}
