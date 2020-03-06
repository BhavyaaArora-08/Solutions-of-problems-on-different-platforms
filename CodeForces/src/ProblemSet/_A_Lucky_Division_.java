package ProblemSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _A_Lucky_Division_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		int n=obj.nextInt();
		int x=Integer.toString(n).length();
		
		ArrayList<String> g=gen(x-1);
		
		
		Comparator<String> c=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.valueOf(o1)-Integer.valueOf(o2);
			}
		};
		
		
		Collections.sort(g,c);
		int flag=0;
		
		for(String val:g)
		{
			if(n%Integer.valueOf(val)==0)
			{
				System.out.println("YES");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("NO");
		
	}
	
	public static ArrayList<String> gen(int n)
	{
		
		if(n==0)
		{
			ArrayList<String> br=new ArrayList();
			br.add(4+"");
			br.add(7+"");
			return br;
		}
		
		
		ArrayList<String> rr=gen(n-1);
		ArrayList<String> mr=new ArrayList<String>();
		
		
		for(String str:rr)
		{
			mr.add(str);
			mr.add(4+str);
			mr.add(7+str);
		}
		
		
		return mr;
	}

}
