package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class GF_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			BigInteger[] dp=new BigInteger[n];
			dp[0]=BigInteger.ZERO;
			
			if(n>=2)
				dp[1]=BigInteger.ONE;
			
			for(int i=2;i<n;i++)
			{
				dp[i]=(dp[i-2].multiply(dp[i-2])).subtract(dp[i-1]);
			}
			
			for(BigInteger val:dp)
				System.out.print(val+" ");
			
			System.out.println();
			
		}
	}

}


//0 1 -1 2 -1 5 -4 29 -13 854 -685 730001 -260776 532901720777 -464897598601 -3381007205976045990 -7342119472323081481 7247539105440992429 7773581439999389092 1237542209864400709 -4928825411596840501 -295864704245926194 8579180227482099755 -8288278452828476007 8200814009296378272