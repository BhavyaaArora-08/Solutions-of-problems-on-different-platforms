
public class _1232_Check_If_It_Is_a_Straight_Line_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
		System.out.println(one(arr));
	}

	//TC: O(n)
	public static boolean one(int[][] arr)
	{
		int x1=arr[0][0];
		int y1=arr[0][1];
		int x2=arr[arr.length-1][0];
		int y2=arr[arr.length-1][1];
		float m=((float)(y2-y1))/(x2-x1);
		
		for(int i=1;i<arr.length-1;i++)
		{
			x2=arr[i][0];
			y2=arr[i][1];
			float md=((float)(y2-y1))/(x2-x1);
			if(md!=m)
				return false;
		}
		return true;
	}
}
