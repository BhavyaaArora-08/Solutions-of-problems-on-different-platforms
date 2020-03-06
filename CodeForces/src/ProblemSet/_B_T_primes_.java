package ProblemSet;

import java.util.Scanner;

public class _B_T_primes_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		while(n-->0)
		{
			int t=obj.nextInt();
			int c=2;
			for(int i=2;i<=t-1;i++)
			{
				if(t%i==0)
				{
					c++;
					break;
				}
				if(c>3)
					break;
			}
			
			if(c==3)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
