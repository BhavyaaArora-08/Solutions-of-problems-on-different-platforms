package ProblemSet;

import java.util.Scanner;

public class _A_Way_Too_Long_Words_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		
		while(t-->0)
		{
			String str=obj.next();
			int x=str.length();
			if(x<10)
				System.out.println(str);
			else
				System.out.println(str.charAt(0)+""+(x-2)+""+str.charAt(x-1));
		}
	}

}
