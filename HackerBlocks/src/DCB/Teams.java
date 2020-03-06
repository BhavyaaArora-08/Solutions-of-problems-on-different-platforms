package DCB;

import java.util.ArrayList;
import java.util.Scanner;

public class Teams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		partition(0, n, m, new ArrayList<>(),n,m);
		System.out.println(max+" "+min);
	}
	
	
	public static int min=Integer.MAX_VALUE;
	public static int max=Integer.MIN_VALUE;
	
	public static void partition(int x,int n,int k,ArrayList<Integer> ll,int totn,int totm)
	{
		if(x>totn-totm+1 || k<0 || n<0)
			return;
		
		if(n==0 && k==0)
		{
			int sum=0;
			for(int val:ll)
			{
				sum+=val;
				if(val==0)
					return;
			}
			
			
			if(sum!=totn)
				return;
			sum=0;
			
			for(int val:ll)
			{
				
				int temp=0;
				
				if(val==1)
					temp=1;
				else
					temp=(val*(val-1))/2;
				
				sum+=temp;
			}
			
			max=Math.max(max, sum);
			min=Math.min(min, sum);
			//System.out.println(ll+" "+max+" "+min);
		}
		
		partition(x+1, n-1,k, ll,totn,totm);
		
		ll.add(x);
		partition(0, n,k-1, ll,totn,totm);
		ll.remove(ll.size()-1);
		
		
	}
	
	

}
