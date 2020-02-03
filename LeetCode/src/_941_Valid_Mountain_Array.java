
public class _941_Valid_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,0};
		System.out.println(valid(arr));
	}
	
	public static boolean valid(int[] arr)
	{
		if(arr.length<3)
			return false;
		
		int i=0;
		
		
		while(i<arr.length-1 && arr[i]<arr[i+1])
			i++;
		
		if(i==0 || i==arr.length-1)
			return false;
		
		i++;
	
		while(i>0 && i<arr.length && arr[i]<arr[i-1])
			i++;
		
		if(i==arr.length)
			return true;
		
		
		
		return false;
	}

}
