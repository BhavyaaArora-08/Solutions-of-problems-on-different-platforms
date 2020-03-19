package ProblemSet;

import java.util.Scanner;

public class _A_Vanya_and_Cubes_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int ans=0;
		int sum=0;
		
		for(int i=1;;i++)
		{
			int x=((i)*(i+1))/2;
			if(sum+x>n)
				break;
			else
			{
				ans=i;
				sum+=x;
			}
			
		}
		
		System.out.println(ans);
	}

}
