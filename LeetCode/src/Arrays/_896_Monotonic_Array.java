
public class _896_Monotonic_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,0};
		System.out.println(mon(arr));
	}
	
	public static boolean mon(int[] arr)
	{
		int i=0;
		
		int flag=0;
		//increasing
		while(i<arr.length-1 && arr[i+1]>=arr[i])
		{
			i++;
			flag=1;
		}
		if(flag==1 && i==arr.length-1)
			return true;
		
		
		i=0;
		//decreasing
		while(i<arr.length-1 && arr[i+1]<=arr[i])
		{
			i++;
		}
		
		if(i==arr.length-1)
			return true;
		else
			return false;
	}

}
