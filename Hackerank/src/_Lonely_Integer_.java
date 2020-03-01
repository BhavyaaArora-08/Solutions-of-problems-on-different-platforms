import java.util.Arrays;

public class _Lonely_Integer_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int find(int[] arr)
	{
		if(arr.length==1)
			return arr[0];
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;)
		{
			int c=0;
			int j=i+1;
			while(j<arr.length && arr[j]==arr[i])
			{
				j++;
				c++;
			}
			
			if(c==0)
				return arr[i];
			
			i=j;
		}
		
		
		return -1;
		
	}
	

}
