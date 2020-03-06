package practise_round_2019;

import java.util.Scanner;

public class Mural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();

		while (t-- > 0) {
			int n = obj.nextInt();
			String str = Integer.toString(n);
			int[] arr = new int[str.length()];
			int i = 0;
			int maxi = 0, max = 0;

			for (char ch : str.toCharArray()) {
				arr[i++] = ch - '0';
				if (arr[i] > max) {
					max = arr[i];
					maxi = i;
				}
			}

			int ans = max;

			int count=0,curr=maxi,p1,p2;
			
			while (count!=arr.length) {
				
				int x,y;
				
				if(p1==arr.length-1 || p2==arr.length-1)
				{
					x=arr[curr-1];
					y=arr[curr-2];
					curr=curr-2;
					p1=p2=curr;
				}
				else if(p1==0)
				{
					x=arr[curr+1];
					y=arr[curr+2];
					curr+=2;
					p1=p2=curr;
				}
				else
				{
					x=arr[curr-1];
					y=arr[curr+1];
					p1=curr-1;
					p2=curr-2;	
				}
				
				
				count+=2;
			}

		}
	}
}
