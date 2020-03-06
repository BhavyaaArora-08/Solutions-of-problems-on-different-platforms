package ProblemSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _B_Kefa_and_Company_ {
	
	public static class pair{
		int m=0;
		int f=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int d=obj.nextInt();
		
		pair[] arr=new pair[n];
		for(int i=0;i<n;i++)
		{
			pair temp=new pair();
			temp.m=obj.nextInt();
			temp.f=obj.nextInt();
			arr[i]=temp;
		}
	
		Comparator<pair> c=new Comparator<_B_Kefa_and_Company_.pair>() {
			
			@Override
			public int compare(pair o1, pair o2) {
				// TODO Auto-generated method stub
				return o2.f-o1.f;
			}
		};
		
		Arrays.sort(arr, c);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i].m+" "+arr[i].f);
		}
		System.out.println();
		
		int m1=arr[0].m;
		int m2=m1;
		
		long max=arr[0].f;
		
		
		for(int i=1;i<n;i++)
		{
			System.out.println(m1+" "+m2+" "+max);
			if(Math.abs(arr[i].m-m1)<d && Math.abs(arr[i].m-m2)<d)
			{
				m1=Math.min(arr[i].m, m1);
				m2=Math.max(arr[i].m, m2);
				max+=arr[i].f;
			}
		}
		
		System.out.println(max);
	}

}
