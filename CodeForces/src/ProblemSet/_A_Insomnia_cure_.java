package ProblemSet;

import java.util.Scanner;

public class _A_Insomnia_cure_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int k=obj.nextInt();
		int l=obj.nextInt();
		int m=obj.nextInt();
		int n=obj.nextInt();
		int d=obj.nextInt();
		int c=0;
		
		for(int i=1;i<=d;i++)
		{
			int flag=0;
			if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
				flag=1;
			if(flag==1)
				c++;
		}
		
		System.out.println(c);
	}

}
