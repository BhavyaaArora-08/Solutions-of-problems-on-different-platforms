import java.util.Arrays;

public class _Mark_and_Toys_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int find(int[] arr,int k)
	{
		Arrays.sort(arr);
		int c=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(sum+arr[i]<k)
			{
				sum+=arr[i];
				c++;
			}
			else
				break;
		}
		
		return c;
	}

}
