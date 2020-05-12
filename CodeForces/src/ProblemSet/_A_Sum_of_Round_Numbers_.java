package ProblemSet;

import java.util.ArrayList;
import java.util.Scanner;

public class _A_Sum_of_Round_Numbers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new  Scanner(System.in);
		int t=obj.nextInt();
		ArrayList<Integer> ll = new ArrayList<Integer>();
		while(t-->0) {
			int n = obj.nextInt();
			int k=0,i=0;
			ll=new ArrayList<Integer>();
			
			while(n!=0) {
				
				int rem = n%10;
				
				if(rem!=0) {
					ll.add(rem* (int) Math.pow(10, i));
					k++;
				}
				
				n=n/10;
				i++;
			}
			
			System.out.println(k);
			for(int val:ll) {
				System.out.print(val+" ");
			}
			
			
		}
	}

}
