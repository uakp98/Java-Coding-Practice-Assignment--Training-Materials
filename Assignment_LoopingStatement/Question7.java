package Assignment_LoopingStatement;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=100,flag,i;
		//a is the start value
		//b is the end value
		while (a < b)
		{
			flag = 0;
			for(i = 2; i <= a/2; ++i)
			{
				if(a % i == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(a +" ");
			}
				++a;
			
		}
	}

}
