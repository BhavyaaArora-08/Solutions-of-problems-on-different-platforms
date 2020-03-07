package ProblemSet;

import java.util.Scanner;

public class _A_I_love_username_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		int min=obj.nextInt();
		int max=min;
		int c=0;
		
		for(int i=1;i<n;i++)
		{
			int temp=obj.nextInt();
			if(temp>max || temp<min)
				c++;
			
			max=Math.max(max, temp);
			min=Math.min(min, temp);
		}
		
		System.out.println(c);
	}

}
