package ProblemSet;

import java.util.Scanner;

public class _A_Wrong_Subtraction_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=obj.nextInt();
		int ans=0;
		
		while(k-->0)
		{
			int rem=n%10;
			if(rem==0)
				ans=n/10;
			else
				ans=n-1;
			
			n=ans;
		}
		
		System.out.println(n);
	}

}
