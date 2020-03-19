
public class _1351_Count_Negative_Numbers_in_a_Sorted_Matrix_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] arr = { { 4, 3, 2, -1 }, 
//				 		{ 3, 2, 1, -1 }, 
//				 		{ 1, 1, -1, -2 }, 
//				 		{ -1, -1, -2, -3 } };
//		
		
		int[][] arr= {{3,2},{1,0}};
		System.out.println(one(arr));
	}
	
	//TC: O(n or m which is greater)
	public static int one(int[][] arr)
	{
		int k=0;
		int i=0,j=arr[0].length-1;
		while(i!=arr.length && j>=0)
		{
			if(arr[i][j]<0)
			{
				k+=(arr.length-i);
				j--;
			}
			else if(arr[i][j]>=0)
			{
				i++;
			}
		}
		
		return k;
	}
	
}
