package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Number to check it is positive or not");
		int no=input.nextInt();
		
		if(no>0) {
			System.out.println("positive value");
		}else if(no == 0){
			System.out.println("zero");
		}else if(no < 0) {
			System.out.println("negative value");
		}
	}

}
