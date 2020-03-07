package ProblemSet;

import java.util.Arrays;
import java.util.Scanner;

public class _A_Choosing_Teams_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=obj.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		
		Arrays.sort(arr);
		int c=0;
		for(int i=0;i<=arr.length-3;i+=3)
		{
			int flag=0;
			for(int j=i;j<i+3;j++)
			{
				if(5-arr[j]<k)
				{
					flag=1;
					break;
				}
					
			}
			if(flag==0)
				c++;
			else
				break;
		}
		
		System.out.println(c);
	}

}
