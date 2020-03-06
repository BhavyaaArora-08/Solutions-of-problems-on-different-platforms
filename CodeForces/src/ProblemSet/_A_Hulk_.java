package ProblemSet;

import java.util.Scanner;

public class _A_Hulk_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print("I hate ");
			}
			else
			{
				System.out.print("I love ");
			}
			
			if(i!=n)
				System.out.print("that ");
			else
				System.out.print("it");
		}
		
		
	}

}
