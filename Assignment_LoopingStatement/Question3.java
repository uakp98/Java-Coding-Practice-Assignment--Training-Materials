package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum = 0;
		  
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        
        System.out.println("Sum of digits "+sum);
  
	}

}
