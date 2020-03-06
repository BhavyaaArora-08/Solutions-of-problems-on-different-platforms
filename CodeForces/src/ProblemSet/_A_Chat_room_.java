package ProblemSet;

import java.util.Scanner;

public class _A_Chat_room_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		String h="hello";
		char[] arr=h.toCharArray();
		
		int c=0;
		
		for(char ch:str.toCharArray())
		{
			if(c==arr.length)
				break;
			
			if(ch==arr[c])
				c++;
		}
		
		if(c==arr.length)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
