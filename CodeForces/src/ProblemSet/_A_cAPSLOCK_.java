package ProblemSet;

import java.util.Scanner;

public class _A_cAPSLOCK_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		String str = obj.next();
		char[] arr = str.toCharArray();
		
		if (str.toUpperCase().equals(str) || ( Character.isLowerCase(arr[0]) && (str.substring(1).toUpperCase().equals( str.substring(1) ) ) ) )
		{			
			for (char ch:str.toCharArray()) 
			{
				if(Character.isLowerCase(ch))
					System.out.print(Character.toUpperCase(ch));
				else
					System.out.print(Character.toLowerCase(ch));
			}
			
		}
		else
			System.out.println(str);

	}

}
