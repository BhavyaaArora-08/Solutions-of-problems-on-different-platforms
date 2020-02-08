import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _31_Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void next(int[] arr)
	{
		
		int flag=0;
		int k=0;
		
		while(k<arr.length && arr[k]<arr[k+1])
			k++;
		
		if(k==0)
		{
			Collections.reverse(Arrays.asList(arr));
			return;
		}
		
		int l=k+1;
		
		while(l<arr.length && arr[k]<arr[l])
			l++;
		
		int temp=arr[k];
		arr[k]=arr[l];
		arr[l]=temp;
		
		
		
	}

	
	
	
//	Find the largest index k such that nums[k] < nums[k + 1]. If no such index exists, just reverse nums and done.
//	Find the largest index l > k such that nums[k] < nums[l].
//	Swap nums[k] and nums[l].
//	Reverse the sub-array nums[k + 1:].

}
