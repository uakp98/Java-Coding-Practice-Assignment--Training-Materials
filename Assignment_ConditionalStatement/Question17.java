package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter a four digit number: ");
	    int n = s.nextInt();
	    
	    if(!(n<10000 && n>999)) {
	    	System.out.println(n + " is not a four digit number.");
	    }else {
		    int last_digit = n%10;
		    int third_digit = (n/10)%10;
		    int second_digit = (n/100)%10;
		    int first_digit = (n/1000)%10;
		    
		    if(first_digit + second_digit == third_digit + last_digit) {
		    	System.out.println("Lucky Number");
		    }else {
		    	System.out.println("Not Lucky Number");
		    }
	    }
	}

}
