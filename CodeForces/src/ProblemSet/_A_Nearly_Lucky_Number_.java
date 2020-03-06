package ProblemSet;

import java.util.Scanner;

public class _A_Nearly_Lucky_Number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		int c=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch=='7' || ch=='4')
				c++;
		}
		
		String x=Integer.toString(c);
		int flag=0;
		
		for(char ch:x.toCharArray())
		{
			if(ch!='7' && ch!='4')
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
