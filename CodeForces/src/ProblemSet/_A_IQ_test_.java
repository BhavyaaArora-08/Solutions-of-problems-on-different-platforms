package ProblemSet;

import java.util.ArrayList;
import java.util.Scanner;

public class _A_IQ_test_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		int i=1;
		while(n-->0)
		{
			int x=obj.nextInt();
			if(x%2==0)
				even.add(i);
			else
				odd.add(i);
			i++;
		}
		
		if(odd.size()==1)
			System.out.println(odd.get(0));
		else
			System.out.println(even.get(0));
	}

}
