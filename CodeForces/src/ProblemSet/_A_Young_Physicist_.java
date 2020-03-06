package ProblemSet;

import java.util.Scanner;

public class _A_Young_Physicist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int sumx,sumy,sumz;
		sumx=sumy=sumz=0;
		
		for(int i=0;i<n;i++)
		{
			sumx+=obj.nextInt();
			sumy+=obj.nextInt();
			sumz+=obj.nextInt();
		}
		
		if(sumx==0 && sumy==0 && sumz==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
