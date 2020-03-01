
public class _Ice_Cream_Parlor_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int[] find(int[] arr,int m)
	{
		int[] ans=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(x+arr[j]==m)
				{
					ans[0]=i+1;
					ans[1]=j+1;
					return ans;
				}
			}
		}
		
		
		return ans;
		
	}

}
