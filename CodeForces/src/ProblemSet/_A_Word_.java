package ProblemSet;

import java.util.Scanner;

public class _A_Word_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		
		int l=0,u=0;
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLowerCase(ch))
				l++;
			else
				u++;
		}		
		
		if(l>=u)
			System.out.println(str.toLowerCase());
		else
			System.out.println(str.toUpperCase());
		
	}

}
