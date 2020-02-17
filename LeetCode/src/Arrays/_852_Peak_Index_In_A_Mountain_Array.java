
public class _852_Peak_Index_In_A_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0};
		System.out.println(peak(arr));
		System.out.println(bins(arr));
	}
	
	public static int peak(int[] arr)
	{
		int i=0;
		while(i<arr.length && arr[i]<arr[i+1])
			i++;
		
////		System.out.println(i);
//		
//		int ans=i;
//		i++;
//		
//		while(i<arr.length && arr[i-1]>arr[i])
//			i++;
//		
////		System.out.println(i);
//		
//		if(i==arr.length)
//			return ans;
		
		
		return i;
	}
	
	//Still need to be checked
	public static int bins(int[] arr)
	{
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<hi)
		{
			int mid=(lo+hi)/2;
			
			if(arr[mid]<arr[mid+1])
				lo=mid+1;
			
			else if(arr[mid-1]>arr[mid])
				hi=mid-1;
			else
				return mid;
				
		}
		
		return -1;
	}

}
