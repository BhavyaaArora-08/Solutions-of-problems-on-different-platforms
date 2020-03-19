
public class _665_Non_decreasing_Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,2,1};
		one(arr);
	}
	
	//TC: O(n)
	public static void one(int[] arr)
	{
		
		int c=0,i=0;
		
		while(i<arr.length-1 )
		{
			if(arr[i]>arr[i+1])
			{
				c++;
				if(i!=0)
				{
					int l=arr[i-1];
					int r=arr[i+1];
					if(r<l)
						arr[i+1]=arr[i]+1;
				}
			}
			if(c>1)
				break;
			i++;
		}
		
		if(i==arr.length-1)
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}
