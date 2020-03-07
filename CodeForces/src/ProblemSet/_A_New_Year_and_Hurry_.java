package ProblemSet;

import java.util.Scanner;

public class _A_New_Year_and_Hurry_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=obj.nextInt();
		
		int total=240-k;
		int sum=0,i;
		for(i=1;i<=n;i++)
		{
			if(sum+(5*i)>total)
			{
				System.out.println(i-1);
				break;
			}
			else
				sum+=(5*i);
		}
		
		if(i==n+1)
			System.out.println(n);
	}

}
