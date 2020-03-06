package ProblemSet;

import java.util.Scanner;

public class _A_Theatre_Square_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int m = obj.nextInt();
		int a = obj.nextInt();
		
		int x=m/a;
		int y=n/a;
		
		if(m%a!=0)
		{
			x++;
		}
		if(n%a!=0)
		{
			y++;
		}

		System.out.println(x*y);
		
	}

}
