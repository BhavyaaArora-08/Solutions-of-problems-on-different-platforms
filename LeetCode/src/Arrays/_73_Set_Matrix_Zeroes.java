import java.util.Arrays;

public class _73_Set_Matrix_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		//find(arr);
		findEff(arr);
	}

	public static void find(int[][] arr) {
		
		int[][] array=new int[arr.length][arr[0].length];
		
		for(int i=0; i<arr.length; i++)
			  for(int j=0; j<arr[i].length; j++)
			    array[i][j]=arr[i][j];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (isItSafe(array, i, j))
					arr[i][j] = 1;
				else
					arr[i][j] = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static boolean isItSafe(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub

		for (int r = 0; r < arr.length; r++) {
			if (arr[r][j] == 0)
				return false;
		}

		for (int c = 0; c < arr[0].length; c++) {
			if (arr[i][c] == 0)
				return false;
		}

		return true;
	}
	
	
	public static void findEff(int[][] arr)
	{
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr.length;c++)
			{
				if(arr[r][c]==0)
				{
					arr[r][0]=0;
					arr[0][c]=0;
				}
			}
		}
		
		for(int r=1;r<arr.length;r++)
		{
			for(int c=1;c<arr.length;c++)
			{
				if(arr[0][c]==0 || arr[r][0]==0)
					arr[r][c]=0;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			} 
			System.out.println();
		}
			
		
	}

}
