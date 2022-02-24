package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}

}
