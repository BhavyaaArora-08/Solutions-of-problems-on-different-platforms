
public class _Sequence_Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,2,1,3,4};
		int[] ans=inverse(a);
		
		for(int val:ans)
			System.out.println(val);
	}
	
	public static int[] inverse(int[] arr)
	{
		int[] ans=new int[arr.length];
		int k=0;
		
		for(int i=1;i<ans.length+1;i++)
		{
			int p=i;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==p)
				{
					p=j+1;
					break;
				}
			}
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==p)
				{
					p=j+1;
					break;
				}
			}
			
			ans[k++]=p;
		}
		
		return ans;
	}

}
