
public class _153_Min_in_rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,1,2};
		System.out.println(min(arr));
	}

	public static int min(int[] arr)
	{
//		int min=0;
		int i=0;
		
		while(i<arr.length && arr[i]<arr[i+1])
			i++;
		
		i++;
		return arr[i];
	}
}
