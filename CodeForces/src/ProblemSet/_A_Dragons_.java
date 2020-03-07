package ProblemSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _A_Dragons_ {

	public static class pair{
		int x;
		int y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int in=obj.nextInt();
		int n=obj.nextInt();
		
		pair[] arr=new pair[n];
		for(int i=0;i<n;i++)
		{
			pair temp=new pair();
			temp.x=obj.nextInt();
			temp.y=obj.nextInt();
			arr[i]=temp;
		}
		
		Comparator<pair> c=new Comparator<_A_Dragons_.pair>() {
			
			@Override
			public int compare(pair o1, pair o2) {
				// TODO Auto-generated method stub
				return o1.x-o2.x;
			}
		};
		
		Arrays.sort(arr, c);
		
//		for(int i=0;i<n;i++)
//			System.out.println(arr[i].x+" "+arr[i].y);
//		System.out.println();
		 
		int s=in;
		int flag=0;
		
		for(int i=0;i<n;i++)
		{
			s=s-arr[i].x;
			if(s<=0)
			{
				flag=1;
				break;
			}
			
			
			s+=arr[i].y+arr[i].x;
		}
		
		if(flag==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
