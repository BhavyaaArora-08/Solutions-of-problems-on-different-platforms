
public class _88_Merge_Sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,0,0,0};
		int[] arr2= {2,5,6};
		ms(arr1, arr2);
		
		for(int val:arr1)
			System.out.println(val);
		
//		int[] ans=ms(arr1, arr2);
//		
//		for(int val:ans)
//			System.out.println(val);
	}
	
	public static void find(int[] arr1,int[] arr2)
	{
		int i=arr1.length-arr2.length-1,j=arr2.length-1;
		int k=arr1.length-1;
		
		while(i<arr1.length && j<arr2.length)
		{
			while(i>=0 && arr1[i]>=arr2[j])
			{
				arr1[k]=arr1[i];
				k--;
				i--;
			}
			
			
			while(j>=0 && arr2[j]>arr1[i])
			{
				arr1[k]=arr2[j];
				j--;
				k--;
			}
		}
		
		for(int val:arr1)
			System.out.println(val);
		
	}
	
	public static void ms(int[] arr1,int[] arr2)
	{
		int[] ans=new int[arr1.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length-arr2.length && j<arr2.length)
		{
			
			while( i<arr1.length-arr2.length && arr1[i]<arr2[j])
				ans[k++]=arr1[i++];
	
			while(i<arr1.length-arr2.length && j<arr2.length && arr2[j]<=arr1[i])
				ans[k++]=arr2[j++];
			
		}
		
		while(i<arr1.length-arr2.length)
			ans[k++]=arr1[i++];
		
		while(j<arr2.length)
			ans[k++]=arr2[j++];
		
		
		for(int i1=0;i1<arr1.length;i1++)
			arr1[i1]=ans[i1];
		
		
	}

}
