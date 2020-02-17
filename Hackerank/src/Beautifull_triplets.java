

public class Beautifull_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1 ,2 ,4 ,5 ,7 ,8 ,10};
		System.out.println(find(arr));
	}
	
	public static int find(int[] arr)
	{
		
		int ans=0;
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				int t1=arr[j]-arr[i];
				for(int k=j+1;k<n;k++)
				{
					int t2=arr[k]-arr[j];
					
					if(t1==t2)
						ans++;
				}
			}
		}
		
		return ans;
	}

}
