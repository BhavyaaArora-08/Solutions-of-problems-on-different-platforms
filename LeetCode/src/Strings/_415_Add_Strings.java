package Strings;

import java.util.ArrayList;

public class _415_Add_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(find("111111111", "222"));
	}
	
	
	public static int find(String o,String t)
	{
		int i=o.length()-1,j=t.length()-1;
		int carry=0;
		String x="";
		
		while(i>=0 || j>=0)
		{
			int sum=carry;
			
			if(i>=0)
			{
				int ch=o.charAt(i)-'1'+1;
				//System.out.println(ch+" "+o.charAt(i));
				sum+=ch;
			}
			
			if(j>=0)
			{
				int ch=t.charAt(j)-'1'+1;
				//System.out.println(ch+" "+t.charAt(j));
				sum+=ch;
			}
			
			int rem=sum%10;
			x=rem+x;
			carry=sum/10;

			i--;
			j--;
		}
		
//		System.out.println(carry);
		
		if(carry>0)
			x=carry+x;
		
		
		return Integer.parseInt(x);
		
			
	}

}
