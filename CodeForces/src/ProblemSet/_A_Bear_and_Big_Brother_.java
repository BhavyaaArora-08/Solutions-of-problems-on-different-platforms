package ProblemSet;

import java.util.Scanner;

public class _A_Bear_and_Big_Brother_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int b=obj.nextInt();
		int B=obj.nextInt();
		
		int c=0;
		
		while(b<=B)
		{
			b=b*3;
			B=B*2;
			c++;			
		}
		
		System.out.println(c);
	}

}
