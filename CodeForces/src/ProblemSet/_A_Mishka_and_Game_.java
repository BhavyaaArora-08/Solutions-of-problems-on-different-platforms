package ProblemSet;

import java.util.Scanner;

public class _A_Mishka_and_Game_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int a1=0,a2=0;
		
		while(n-->0)
		{
			int m=obj.nextInt();
			int c=obj.nextInt();
			
			if(m>c)
				a1++;
			else if(m<c)
				a2++;
	
		}
		
		if(a1>a2)
			System.out.println("Mishka");
		else if(a1<a2)
			System.out.println("Chris");
		else
			System.out.println("Friendship is magic!^^");
	}

}
