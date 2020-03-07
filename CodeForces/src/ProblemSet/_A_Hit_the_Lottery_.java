package ProblemSet;

import java.util.Scanner;

public class _A_Hit_the_Lottery_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int c=0;
		
		int x=(n/100);
		c+=x;
		n=n-(x*100);
		
		x=(n/20);
		c+=x;
		n=n-(x*20);
		
		x=(n/10);
		c+=x;
		n=n-(x*10);
		
		x=(n/5);
		c+=x;
		n=n-(x*5);
		
		x=(n/1);
		c+=x;
		n=n-(x*1);
		
		System.out.println(c);
	}

}
