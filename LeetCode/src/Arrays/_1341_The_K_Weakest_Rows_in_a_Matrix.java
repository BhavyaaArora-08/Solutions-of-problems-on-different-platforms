import java.util.Arrays;

public class _1341_The_K_Weakest_Rows_in_a_Matrix  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= {{1,1,0,0,0},
		              {1,1,1,1,0},
		              {1,0,0,0,0},
		              {1,1,0,0,0},
		              {1,1,1,1,1}} ;
		
		int[] ans=weak(mat, 3);
		for(int val:ans)
			System.out.println(val);
	}
	
	public static class pair implements Comparable<pair> {
		int count;
		int idx;
		
		public pair(int x,int y) {
			count=x;
			idx=y;
		}
		
		public int compareTo(pair o) {
			
			//System.out.println("comparing"+" "+this.count+" and "+o.count);
			int ans=0;
			// TODO Auto-generated method stub
			if(this.count == o.count)
				ans= this.idx-o.idx;
			
			else
				ans= this.count-o.count;
			
			//System.out.println(ans);
			return ans;
		}
	}
	
	public static int[] weak(int[][] mat,int k)
	{
		pair[] c=new pair[mat.length];
		//System.out.println(c[0]);
		
		for(int i=0;i<c.length;i++)
			c[i]=new pair(0,0);
		
		for(int i=0;i<mat.length;i++)
		{			
			for(int j=0;j<mat[0].length;j++)
			{
				if(mat[i][j]==1)
					c[i].count ++;
			}
			
			c[i].idx=i;
		}
		
		int[] ans=new int[k];
		
//		for(int i=0;i<c.length;i++)
//			System.out.println(c[i].count+" "+c[i].idx);
		
		Arrays.sort(c);
		
//		for(int i=0;i<c.length;i++)
//			System.out.println(c[i].count+" "+c[i].idx);
		
		
//		for(int i=0;i<k;i++)
//			ans[i]=c[i].idx;
		
		
		return ans;
	}

	

}
