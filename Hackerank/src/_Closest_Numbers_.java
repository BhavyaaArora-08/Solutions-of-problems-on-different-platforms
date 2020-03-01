import java.util.ArrayList;
import java.util.Arrays;

public class _Closest_Numbers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static int[] finda(int[] arr)
	{
		Arrays.sort(arr);
		int min=find(arr);
		ArrayList<Integer> ll=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int x=Math.abs(arr[i]-arr[j]);
				if(x>min)
					break;
				else if(x==min)
				{
					ll.add(i);
					ll.add(j);
					break;
				}
			}
		}
		
		int[] ans=new int[ll.size()];
		int i=0;
		for(int val:ll)
			ans[i++]=val;
		
		
		return ans;
		
		
	}
	
	public static int find(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int x=Math.abs(arr[i]-arr[j]);
				if(x>min)
					break;
				min=Math.min(x, min);
			}
		}
		
		return min;
	}

}
