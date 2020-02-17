package alisha;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};
		subarray(a);
	}

	public static void subarray(int[] a)

	{
		for(int si=0;si<a.length;si++)
		{
			for(int ei=si;ei<a.length;ei++) {
				
			int sum = 0;
			for(int k=si;k<=ei;k++)
			
			{
				sum = sum + a[k];
				
			}
			System.out.print(sum);
			
			System.out.println();

		}
	}

	}

}
