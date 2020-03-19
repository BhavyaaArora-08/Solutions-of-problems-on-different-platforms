import java.util.Arrays;
import java.util.HashMap;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,1,2,2,3};
		int[] ans=find(arr);
		
		for(int val:ans)
			System.out.print(val+" ");
		
		System.out.println();
		
		ans=two(arr);
		
		for(int val:ans)
			System.out.print(val+" ");
		
		System.out.println();
	}
	
	//TC: O(n^2)
	public static int[] find(int[] arr)
	{

		int[] ans=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
					ans[i]++;
			}
		}
		
		
		return ans;
	}
	
	//TC: O(nlogn)
	public static int[] two(int[] arr)
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		int[] ans=new int[arr.length];
		
		int[] hey=Arrays.copyOf(arr, arr.length);
		Arrays.sort(hey);
		
		int k=0;
		for(int i=0;i<hey.length;i++)
		{
			if(!map.containsKey(hey[i]))
				map.put(hey[i],k++);
			else
				k++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			ans[i]=map.get(arr[i]);
		}
		
		return ans;
	}
	
	//TC: O(n) using count sort
	public static int[] three(int[] arr)
	{
		
	}
	
	
}
