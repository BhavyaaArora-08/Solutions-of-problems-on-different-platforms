package ProblemSet;

import java.util.Scanner;

public class _A_In_Search_of_an_Easy_Problem_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int flag=0;
		while(n-->0)
		{
			int ch=obj.nextInt();
			if(ch==1)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("EASY");
		else
			System.out.println("HARD");
	}

}
