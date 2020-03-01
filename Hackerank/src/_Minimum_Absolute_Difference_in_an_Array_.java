import java.util.Arrays;

public class _Minimum_Absolute_Difference_in_an_Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int find(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		
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
