
public class _62_Unique_Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(3,2));
	}
	
	
	public static int find(int m,int n)
	{
		int[][] dp=new int[m][n];
		
		for(int i=0;i<n;i++)
			dp[m-1][i]=1;
		
		for(int i=0;i<m;i++)
			dp[i][n-1]=1;
		
		
		for(int r=m-2;r>=0;r--)
		{
			for(int c=n-2;c>=0;c--)
			{
				dp[r][c]=dp[r+1][c]+dp[r][c+1];
			}
		}
		
		
		return dp[0][0];
	}
	
	
	public static int find(int cr,int cc,int tr,int tc)
	{
		if(cr==tr && cc==tc)
			return 1;
		
		if(cr>tr || cc>tc)
			return 0;
		
		
		int x= find(cr+1, cc, tr, tc);
		int y= find(cr, cc+1, tr, tc);
		
		return x+y;
		
	}

}
