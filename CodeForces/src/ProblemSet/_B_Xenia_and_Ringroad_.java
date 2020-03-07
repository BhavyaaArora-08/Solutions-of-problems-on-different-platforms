package ProblemSet;

import java.util.Scanner;

public class _B_Xenia_and_Ringroad_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		
		int[] a=new int[m];
		for(int i=0;i<m;i++)
			a[i]=obj.nextInt();
		
		int curr=1;
		int to;
		long c=0l;
//		System.out.println();
		for(int i=0;i<m;i++)
		{
			to=a[i];
			if(to-curr>=0)
				c+=(to-curr);
			else
				c+=((n-curr)+to);
//			System.out.println(curr+" "+to+" "+c);
				
			curr=to;
		}
		
//		System.out.println();
		System.out.println(c);
	}

}
