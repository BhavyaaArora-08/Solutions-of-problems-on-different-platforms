package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++)
				arr[i]=obj.nextInt();
			
			ll=new ArrayList<Integer>();
			subsetSum(0, 0, arr,"");
			Collections.sort(ll);
			
			for(int val:ll)
				System.out.print(val+" ");
			
			System.out.println();
		}
	}
	
	public static ArrayList<Integer> ll=new ArrayList<Integer>();
	
	public static void subsetSum(int vidx,int sum,int[] arr,String str)
	{
		
		if(vidx==arr.length)
		{
//			System.out.println(str);
			ll.add(sum);	
			return;
		}
		
		subsetSum(vidx+1, sum+arr[vidx], arr,str+arr[vidx]+" ");
		subsetSum(vidx+1, sum, arr,str);
		return;
		
	}

}
