package _20th_March_2020;

import java.util.Arrays;

public class _455_Assign_Cookies_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] g= {1,2};
		int[] c= {1,2,3};
		System.out.println(one(g, c));
	}
	
	//TC: O(nlogn)
	public static int one(int[] g,int[] c)
	{
		Arrays.sort(g);
		Arrays.sort(c);
		int ans=0;
		int i=0;
		int j=0;
		
		while(j<g.length && i<c.length)
		{
			if(c[i]<g[j])
				i++;
			else
			{
				ans++;
				i++;
				j++;
			}
		}
		
		return ans;
	}

}
