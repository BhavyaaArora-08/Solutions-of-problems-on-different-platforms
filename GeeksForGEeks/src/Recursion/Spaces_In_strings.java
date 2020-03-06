package Recursion;

import java.util.Scanner;

public class Spaces_In_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();
		while (t-- > 0) {
			String str = obj.next();
//			System.out.print(str);
			fun("", str, str);
			System.out.println();
			
		}
	}
	
	public static void fun(String ans,String str,String s)
	{
		if(str.length()==1)
		{
			System.out.print(ans+str+"$");
			return;
		}
		
		char ch =str.charAt(0);
		String ros=str.substring(1);
		
		fun(ans+ch, ros, s);
		fun(ans+ch+" ", ros, s);
		
		return;
		
	}

}
