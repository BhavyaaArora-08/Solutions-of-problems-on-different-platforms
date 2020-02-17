import java.util.ArrayList;
import java.util.Scanner;

public class _5_Longest_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		bruteForce(str);
		System.out.println(nsquared(str));
	}
	
	public static String nsquared(String str)
	{
		String ans="";
		int max=-1;
		
		for(int i=0;i<str.length();i++)
		{
			String temp=extend(i,i, str);
			String temp2=extend(i, i+1, str);
			
			if(temp.length()>max)
			{
				ans=temp;
				max=temp.length();
			}
			
			if(temp2.length()>max)
			{
				ans=temp2;
				max=temp2.length();
			}
			
		}
		
		return ans;
	}
	
	public static String extend(int cen1,int cen2,String str)
	{
		int si=cen1;
		int ei=cen2;
		
		while(si>=0 && ei<str.length() && str.charAt(si)==str.charAt(ei))
		{
//			System.out.println(si+" "+ei);
			si--;
			ei++;
		}
	
		return str.substring(si+1,ei);
	}
	
	public static void bruteForce(String str)
	{
		ArrayList<String> rr= new ArrayList<String>();
		
		int max=Integer.MIN_VALUE;
		String ans="";
		
		for(int si=0;si<str.length();si++)
		{
			for(int ei=si+1;ei<=str.length();ei++)
			{
				String val = str.substring(si,ei);
				int j=0;
				int k=val.length()-1;
				
				while(j<val.length() && j<=k && val.charAt(j)==val.charAt(k))
				{
					j++;
					k--;
				}
				
				if(j>k && val.length()>max)
				{
					max=val.length();
					ans=val;
				}
			}
		}
		
		if(max!=-1)
			System.out.println(ans);

	}
}
