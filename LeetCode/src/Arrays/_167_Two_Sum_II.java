import java.util.HashMap;

public class _167_Two_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,11,15};
		
		int[] ans=dontforgetthis(arr, 17);
		
		for(int val:ans)
			System.out.print(val+" ");
		
		System.out.println();
	}
	
	public static int[] dontforgetthis(int[] arr,int target)
	{
		int[] ans=new int[2];
		
		if(arr.length<2)
			return new int[2];
		
		int l=0,r=arr.length-1;
		
		while(l<r)
		{
			int sum=arr[l]+arr[r];
			if(sum>target)
				r--;
			else if(sum<target)
				l++;
			else
			{
				ans[0]=l+1;
				ans[1]=r+1;
				return ans;
			}
		}
		
		return ans;
		
	}
	
	public static int[] finda(int[] arr,int target)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int[] ans=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		
		for(int i=0;i<arr.length && arr[i]<target;i++)
		{
			if(map.containsKey(target-arr[i]))
			{
				ans[0]=i+1;
				ans[1]=map.get(target-arr[i])+1;
				return ans;
			}
		}
		
		return ans;
	}
	
	public static int[] find(int[] arr,int target)
	{
		int[] ans=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>target)
				break;
			
			int temp=arr[i];
			
			int j=i+1;
			
			while(j<arr.length)
			{
				if(arr[j]==target-temp)
				{
					ans[0]=i+1;
					ans[1]=j+1;
					return ans;
				}
				j++;
			}
		}
		
		return ans;
		
	}

}
