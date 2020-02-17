
public class _485_Max_Consecutive_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,1,0,0,1,1,1};
		System.out.println(max(arr));
	}
	
	
	public static int max(int[] arr)
	{
		int max=0;
		int i=0;
		
		while(i<arr.length)
		{
			int t=0;
			
			while(i<arr.length && arr[i]==0)
				i++;
			
			while(i<arr.length && arr[i]==1)
			{
				i++;
				t++;
			}
			
			max=Math.max(t, max);
		}
		
		return max;
		
	}

}
