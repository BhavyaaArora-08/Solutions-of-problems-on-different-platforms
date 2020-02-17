package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class _1331_Rank_Transform_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {37,12,28,9,100,56,80,5,12};
		int[] ans=find(arr);
		
		for(int val:ans)
			System.out.println(val);
	}
	
	static class index implements Comparator<pair>
	{

		@Override
		public int compare(pair o1, pair o2) {
			// TODO Auto-generated method stub
			return o1.idx-o2.idx;
		}
		
	}

	static class pair implements Comparable<pair>{

		int val;
		int idx;
		int rank;
		
		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.val-o.val;
		}
		
		
	}
	
	public static int[] find(int[] arr)
	{
		int[] ans=new int[arr.length];
		pair[] pp=new pair[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			pp[i]=new pair();
			pp[i].val=arr[i];
			pp[i].idx=i;
		}
		
		Arrays.sort(pp);
		
		pp[0].rank=1;
		
		for(int i=1;i<pp.length;i++)
		{
			int x = pp[i].val;
			int y = pp[i-1].val;
			
			if(x==y)
				pp[i].rank=pp[i-1].rank;
			else
				pp[i].rank=pp[i-1].rank+1;
		}
		
//		index hey=new index();
//		
//		Arrays.sort(pp,hey);
		
		for(int i=0;i<pp.length;i++)
		{
			ans[pp[i].idx]=pp[i].rank;
		}
		
		return ans;
	}
}
