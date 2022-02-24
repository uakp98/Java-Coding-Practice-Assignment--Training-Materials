package Assignment_LoopingStatement;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers between 1 and 100 are ");
		for(int i=1;i<100;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
