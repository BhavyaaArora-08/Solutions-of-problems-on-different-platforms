package ProblemSet;

import java.util.Scanner;

public class _A_Soldier_and_Bananas_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int k=obj.nextInt();
		int n=obj.nextInt();
		int w=obj.nextInt();
		
		int x=((w)*(w+1))/2;
		x=k*x;
		
		if(x>n)
			System.out.println(x-n);
		else
			System.out.println(0);
	}

}
