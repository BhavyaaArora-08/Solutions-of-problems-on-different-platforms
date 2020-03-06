package ProblemSet;

import java.util.Scanner;

public class _A_Elephant_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int x=n/5;
		if(n%5!=0)
			x++;
		System.out.println(x);
	}

}
