
public class _665_Non_Decreasing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,3};
		System.out.println(non(arr));
	}
	
	public static boolean non(int[] arr)
	{
		if(arr.length<=1)
			return true;
		
		int i=0;
		
		while(i<arr.length-1 && arr[i]<=arr[i+1])
			i++;
		
		int c=0;
		
		if(i!=arr.length-2)
			change(i,arr);
		
		i=0;
		
		while(i<arr.length-1 && arr[i]<=arr[i+1])
			i++;
		
		if(i!=arr.length-1)
			return false;
		
		return true;
		
	}

	private static void change(int i, int[] arr) {
		// TODO Auto-generated method stub
		
		int t=arr[i];
		int s;
		if(i==0)
			s=0;
		else
			s=arr[i-1];
		
		for(int j=i;j<arr.length;j++)
		{
			if(arr[i]==t)
				arr[i]=s;
		}
		
	}

}
