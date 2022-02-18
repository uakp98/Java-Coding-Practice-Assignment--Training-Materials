package Assignment_ConditionalStatement;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Full Marks: ");
		int fullMarks=sc.nextInt();
		
		System.out.print("Enter Obtained Marks: ");
		double obtainMarks=sc.nextDouble();
		
		double percentage= (obtainMarks / fullMarks)*100;
		String grade="";
		
		if(percentage >= 90) {
			grade="A+";
		}else if(percentage>=75 && percentage<90){
			grade="A";
		}else if(percentage>=65 && percentage<75){
			grade="B+";
		}else if(percentage>=50 && percentage<65){
			grade="B";
		}else if(percentage>=35 && percentage<50) {
			grade="C";
		}else if(percentage<35) {
			grade="fail";
		}
		
		System.out.println("Your grade: " + grade);
	}

}
