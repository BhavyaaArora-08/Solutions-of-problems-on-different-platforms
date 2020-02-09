
public class _Circular_Array_Rotation {
	public static void main(String[] args) {
		
	}
	
	
//	 int[] hey=new int[arr.length];
//		
//		for(int i=0;i<arr.length;i++)
//			hey[(i+k)%arr.length]=arr[i];
//		
//		for(int i=0;i<arr.length;i++)
//			arr[i]=hey[i];
	
	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
