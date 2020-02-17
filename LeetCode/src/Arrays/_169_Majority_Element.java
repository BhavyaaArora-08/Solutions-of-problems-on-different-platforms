import java.util.Arrays;
import java.util.HashMap;

public class _169_Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,7,7,5,5,1,5,5,7,7};
		
		System.out.println(fm(arr));
		System.out.println(faster(arr));
		System.out.println(find(arr));
	}
	
	
	public static int fm(int[] arr)
	{
		
		Arrays.sort(arr,0,arr.length/2+1);
		return arr[arr.length/2];
		
	}
	
	
	//TC:O(n)
	public static int faster(int[] arr)
	{
		int n=arr.length;
		int ans=-1;
		int max=0;
		
		Arrays.sort(arr);
		int i=0;
		
		while(i<arr.length)
		{
			int temp=arr[i];
			int c=0;
			
			while(i<arr.length && arr[i]==temp)
			{
				i++;
				c++;
			}
			
			
			if(c>max)
			{
				max=c;
				ans=temp;
			}
			
			if(c>n/2)
				break;
			
			
		}
		
		return ans;
		
	}
	
	//TC:O(n+nlogn) 
	public static int find(int[] arr)
	{
		int ans=-1;
		int max=0;
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int val:arr)
			map.put(val, map.getOrDefault(val,0)+1);
		
		for(int key:map.keySet())
		{
			int temp=map.get(key);
			if(temp>max)
			{
				max=temp;
				ans=key;
			}
		}
		
		return ans;
		
	}

}
