package ProblemSet;

import java.util.Scanner;

public class _A_Magnets_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		String[] arr=new String[n];
		
		for(int i=0;i<n;i++)
			arr[i]=obj.next();
		
		int c=1;
		String prev=arr[0];
		for(int i=1;i<n;i++)
		{
			if(!arr[i].equals(prev))
			{
				prev=arr[i];
				c++;
			}
		}
		
		System.out.println(c);
		
	}

}
