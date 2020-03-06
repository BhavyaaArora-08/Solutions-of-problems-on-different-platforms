package ProblemSet;

import java.util.LinkedList;
import java.util.Scanner;

public class _A_Case_of_the_Zeros_and_Ones_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		String str=obj.next();
		char[] arr=str.toCharArray();
		
		LinkedList<Character> stack=new LinkedList<>();
		
		char prev=str.charAt(0);
		stack.push(prev);
		
		for(int i=1;i<n;i++)
		{
			char curr=str.charAt(i);
			
			if((curr=='0' && prev=='1') || (curr=='1' && prev=='0') )
			{
				stack.pop();
				if(stack.isEmpty() && i!=n-1)
				{
					prev=str.charAt(i+1);
				}
				else if(i!=n-1)
					prev=stack.peek();
			}
			else
			{
				stack.push(curr);
				prev=curr;
			}
			
			
			
		}
		
		System.out.println(stack.size());
		
	}

}
