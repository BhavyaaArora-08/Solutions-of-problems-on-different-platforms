package practise_round_2019;

import java.util.Scanner;

public class KickStart_Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
//		N, K, x1, y1, C, D, E1, E2 and F
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			int k=obj.nextInt();
			int x1=obj.nextInt();
			int y1=obj.nextInt();
			int c=obj.nextInt();
			int d=obj.nextInt();
			int e1=obj.nextInt();
			int e2=obj.nextInt();
			int f=obj.nextInt();
			
			int[] a=new int[n];
			a[0]=(x1+y1)%f;
			for(int i=1;i<n;i++)
			{				
				int temp1 = ((c * x1) % f + (d * y1) % f + (e1) % f) % f;
				int temp2 = ((d * x1) % f + (c * y1) % f + (e1) % f) % f;
				a[i]=(temp2+temp1)%f;
				x1=temp1;
				y1=temp2;
				
			}
			
			for(int val:a)
				System.out.print(val+" ");
			System.out.println();
			
			int ans=0;
			for(int l=1;l<=k;l++)
			{
				
				for(int si=0;si<n;si++)
				{
					for(int ei=si;ei<n;ei++)
					{
						int x=1;
						for(int h=si;h<=ei;h++)
						{
//							(k-j+1)i
							ans+=(a[h]*(Math.pow(x, l)%1000000007))%1000000007;
							ans=ans%1000000007;
							x++;
						}
					}
				}	
				
			}
			System.out.println(ans%1000000007);
		}
	}
	
	

}
