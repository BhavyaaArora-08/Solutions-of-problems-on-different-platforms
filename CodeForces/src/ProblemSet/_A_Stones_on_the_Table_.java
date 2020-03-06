package ProblemSet;

import java.util.Scanner;

public class _A_Stones_on_the_Table_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		String str=obj.next();
		int c=0;
		
		char prev=' ';
		
		for(char ch:str.toCharArray())
		{
			if(prev==' ')
			{
				prev=ch;
			}
			else if(ch==prev)
			{
				c++;
			}
			else
			{
				prev=ch;
			}
		}
		
		System.out.println(c);
		
		
	}

}
