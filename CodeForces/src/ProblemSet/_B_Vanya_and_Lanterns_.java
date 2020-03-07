package ProblemSet;

import java.util.Arrays;
import java.util.Scanner;

public class _B_Vanya_and_Lanterns_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int l=obj.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=obj.nextInt();
		
		double max=0;
		Arrays.sort(arr);
		
		for(int i=0;i<n-1;i++)
			max=Math.max(max,(arr[i+1]-arr[i]));
		
		max=(double) Math.max(max/(double)2, Math.max(arr[0], l-arr[arr.length-1]));
		System.out.println(max);
		
	}

}
