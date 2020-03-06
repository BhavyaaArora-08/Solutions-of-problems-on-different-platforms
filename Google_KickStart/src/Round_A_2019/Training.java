package Round_A_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		int j=0;
		
		while(t-->0)
		{
			j++;
			
			int min=Integer.MAX_VALUE;
			
			int n=obj.nextInt();
			int p=obj.nextInt();
			
			
			Integer[] arr=new Integer[n];
			for(int i=0;i<n;i++)
				arr[i]=obj.nextInt();
					
			Arrays.sort(arr,Collections.reverseOrder());
			int[] sum=new int[arr.length-p+1];
			for(int i=0;i<p;i++)
			{
			     sum[0]+=arr[i];  
			}
			
//			System.out.println(sum[0]);
			for(int i=1;i<=arr.length-p;i++)
			{
				//System.out.println(i+" "+p+" "+(i-1)+" "+(i+p-1));
				sum[i]=sum[i-1]-arr[i-1]+arr[i+p-1];
//				System.out.println(sum[i]);
				
			}
			
 			int u=0;
			for(int i=0;i<=arr.length-p;i++)
			{
				int x=(p*arr[i] - sum[u++]);
				
				min=Math.min(min, x);
			}
			
			//gen(0, p, arr, new ArrayList<Integer>());
			
			System.out.println("Case #"+j+": "+min);
		}
			
		
	}

	// Method one which is very time taking
	public static int min=Integer.MAX_VALUE;

	public static void gen(int vidx, int k, int[] arr, ArrayList<Integer> ll) {

		if (k == 0) {
			int x = 0;
			int y = ll.get(ll.size() - 1);

			for (int val : ll) {
				x += (y - val);
			}

			min = Math.min(x, min);

			return;
		}

		if (vidx == arr.length)
			return;

		ll.add(arr[vidx]);
		gen(vidx + 1, k - 1, arr, ll);
		ll.remove(ll.size() - 1);

		gen(vidx + 1, k, arr, ll);

	}

}
