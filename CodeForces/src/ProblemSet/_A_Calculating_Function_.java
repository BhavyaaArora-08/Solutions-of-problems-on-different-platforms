package ProblemSet;

import java.util.Scanner;

public class _A_Calculating_Function_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		long n=obj.nextLong();
		long e,o;
		if(n%2==0)
		{
			e=o=n/2;
		}
		else
		{
			e=n/2;
			o=n/2 + 1;
		}
		
		long even = e * (e+1);
		long odd = o*o;
		
		System.out.println(even-odd);
	}

}
