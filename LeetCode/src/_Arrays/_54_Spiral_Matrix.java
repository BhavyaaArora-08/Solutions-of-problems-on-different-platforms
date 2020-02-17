
public class _54_Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		VertDisp(arr);
		System.out.println();
		WaveDisp(arr);
	}

	public static void VertDisp(int[][] arr) {
		for (int c = 0; c < arr.length; c++) 
		{

			for (int r = 0; r < arr.length; r++)
			{
				System.out.print(arr[r][c] + " ");
			}

			// System.out.println();
		}
	}

	public static void WaveDisp(int[][] arr) {
		for (int c = 0; c < arr.length; c++) {

			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}

			// System.out.println();
		}
	}
	
	public static void spiralDisp(int[][] arr)
	{
		int count=0;
		int tot=arr.length*arr[0].length;
		int r=0,c=0;
		while(count<tot)
		{
			//Horz right
			for(int i=c;count<tot && i<arr[r].length;i++)
			{
				System.out.print(arr[r][i]);
				count++;
			}		
			
			//Vert Down
			for(int i=r;count<tot && i<arr.length;i++)
			{
				System.out.print(arr[i][c]);
				count++;
			}
			
			
			//Horz left
			for(int i=arr[0].length-1;i>=)
			
			//Vert Up
			
		}
	}
	
//	public static List<Integer> find(int[][] arr) {
//
//	}

}
