package _20th_March_2020;

public class _643_Maximum_Average_Subarray_I_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,12,-5,-6,50,3};
		System.out.println(one(arr, 4));
	}
	
	public static double one(int[] arr,int k)
	{
		int sum=0;
		for(int i=0;i<k;i++)
			sum+=arr[i];
		int ans=sum;
		
		for(int i=1;i+k<=arr.length;i++)
		{
			sum+=-arr[i-1]+arr[i+k-1];
			ans=Math.max(sum, ans);
		}
		
		return ans/1.0/k;
		
	}

}
