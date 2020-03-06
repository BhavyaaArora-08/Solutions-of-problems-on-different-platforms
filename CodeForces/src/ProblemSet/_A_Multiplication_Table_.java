package ProblemSet;

import java.util.Scanner;

public class _A_Multiplication_Table_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		int y=obj.nextInt();
		int c=0;
		
		for(int i=1;i<=x;i++)
		{
			if(y%i==0 && y/i<=x)
				c++;
		}
		
		System.out.println(c);
		
	}

}
