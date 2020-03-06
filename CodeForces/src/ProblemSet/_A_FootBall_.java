package ProblemSet;

import java.util.Scanner;

public class _A_FootBall_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		int c=0;
		char prev=str.charAt(0);
		int flag=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch==prev)
				c++;
			else
			{
				prev = ch;
				c=1;
			}
			
			if(c>=7)
			{
				System.out.println("YES");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("NO");
	}

}
