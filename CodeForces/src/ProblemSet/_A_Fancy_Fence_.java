package ProblemSet;

import java.util.Scanner;

public class _A_Fancy_Fence_ {
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		
		//(n-2)/n * 180
		
		while(t-->0)
		{
			int a=obj.nextInt();
			if((360/(float)(180-a)) - (360/(180-a)) == 0 )
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
