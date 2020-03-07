package ProblemSet;

import java.util.Scanner;

public class _B_Drinks_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=obj.nextInt();
		
		System.out.println(sum/(double)n);
	}

}
