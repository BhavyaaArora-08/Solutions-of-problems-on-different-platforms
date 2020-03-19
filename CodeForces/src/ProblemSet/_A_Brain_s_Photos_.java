package ProblemSet;

import java.util.Scanner;

public class _A_Brain_s_Photos_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		int flag=0;
		
		for(int i=0;i<n*m;i++)
		{
			char ch=obj.next().charAt(0);
			if(ch=='C' || ch=='M' || ch=='Y')
			{
				flag=1;
				System.out.println("#Color");
				break;
			}
		}
		
		if(flag==0)
			System.out.println("#Black&White");
	}

}
