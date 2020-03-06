package ProblemSet;

import java.util.Scanner;

public class _A_Kefa_and_First_Steps_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		int max=0;
		int prev=0;
		int c=0;
		
		while(n-->0)
		{
			int temp=obj.nextInt();
//			System.out.println(temp+" "+prev);
			if(temp>=prev)
			{
				prev=temp;
//				System.out.println(prev+" "+c);
				c++;
				
			}
			else
			{
//				System.out.println(c);
				max=Math.max(c, max);
				prev=temp;
				c=1;
//				System.out.println(prev+" "+c);
			}
			
			if(n==0)
				max=Math.max(c, max);
		}
				
		System.out.println(max);
	}
	
	

}
