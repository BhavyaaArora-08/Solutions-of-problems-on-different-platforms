package ProblemSet;

import java.util.HashMap;
import java.util.Scanner;

public class _A_I_Wanna_Be_the_Guy_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();
		int c=2;
		while(c-->0)
		{
			int x=obj.nextInt();
			while(x-->0)
				map.put(obj.nextInt(), true);
		}
		
		if(map.size()==n)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
	}

}
