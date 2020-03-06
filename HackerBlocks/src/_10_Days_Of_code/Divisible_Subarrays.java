package _10_Days_Of_code;

import java.util.Scanner;

public class Divisible_Subarrays {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=obj.nextInt();
			
			System.out.println(find(arr, n));
		}
	}
	
	public static int find(int[] arr,int n)
	{
		int count=0;
		for(int si=0;si<n;si++)
		{
			int sum=0;
			for(int ei=si;ei<n;ei++)
			{
				sum+=arr[ei];
				if(sum%n==0)
					count++;
			}
		}
		
		return count;
	}
}
