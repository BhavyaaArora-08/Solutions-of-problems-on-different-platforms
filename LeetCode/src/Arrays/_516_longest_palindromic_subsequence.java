import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//import jdk.javadoc.internal.doclets.toolkit.builders.PackageSummaryBuilder;

public class _516_longest_palindromic_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		ArrayList<String> rr =fun(str);
		Collections.sort(rr, Comparator.comparing(String::length));
//		System.out.println(rr);
		
		for(int i=rr.size()-1;i>=0;i--)
		{
			String val=rr.get(i);
			int j=0;
			int k=val.length()-1;
			
			while(j<val.length() && j<=k && val.charAt(j)==val.charAt(k))
			{
				j++;
				k--;
			}
			
			if(j>k)
			{
				System.out.println(val);
				break;
			}
		}
	}
	
	public static ArrayList<String> fun(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		
		
		ArrayList<String> rr = fun(str.substring(1));
		char ch=str.charAt(0);
		
		ArrayList<String> mr=new ArrayList<String>();
		
		for(String val:rr)
		{
			mr.add(val);
			mr.add(ch+val);
		}
		
		return mr;
		
	}
}
