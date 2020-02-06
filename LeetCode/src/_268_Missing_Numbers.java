import java.util.Arrays;

public class _268_Missing_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,2,3,9,7,5,6,4};
		System.out.println(fst(arr));
//		System.out.println(find(arr));
	}
	
	public static int fst(int[] arr)
	{
		Arrays.sort(arr);
		int prev=0;
		for(int i=0;i<arr.length+1;i++)
		{
			if(i==arr.length || arr[i]!=prev)
				return prev;
			
			prev=arr[i]+1;
		}
		
		return -1;
	}
	
	public static int find(int[] arr)
	{
		int[] hey=new int[arr.length+1];
		
		for(int val:arr)
			hey[val]++;
		
		for(int i=1;i<hey.length;i++)
		{
			if(hey[i]==0)
				return i;
		}
		
		return -1;
		
	}

}
