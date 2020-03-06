package ProblemSet;

import java.util.Scanner;

public class _A_Next_Round_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=obj.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=obj.nextInt();
		
		int x=arr[k-1];
		int c=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=x && arr[i]>0)
				c++;
		}
		
		System.out.println(c);
	}

}
