
public class _1260_Shift_2D_Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 3, 8, 1, 9 },
						{ 19, 7, 2, 5 }, 
						{ 4, 6, 11, 10 }, 
						{ 12, 0, 21, 13 }
					  };

		lessSpace(mat, 4);
	}

	
	public static void lessSpace(int[][] mat,int k)
	{
		
		int m = mat.length, n = mat[0].length;
		
		while(k-->0)
		{
			int last=mat[mat.length-1][mat[0].length-1];
			
			for (int i = mat.length-1; i >=0 ; i--) {
				for (int j = mat[0].length-1; j >=0 ; j--) {
					
					if(i==n-1 && j==m-1)
					{
						
					}
					else if (j == n - 1)
						mat[i + 1][0] = mat[i][j];
					else
						mat[i][j + 1] = mat[i][j];
					
				}
			}
			
			
			mat[0][0]=last;
		}
		
		
		for (int[] val1 : mat) {
			for (int val : val1)
				System.out.print(val + " ");

			System.out.println();
		}
		
	}
	
	public static void find(int[][] mat, int k) {

		int[][] mata = new int[mat.length][mat[0].length];

		int m = mat.length, n = mat[0].length;

		while (k-- > 0) {

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[0].length; j++) {
					if (i == m - 1 && j == n - 1)
						mata[0][0] = mat[i][j];
					else if (j == n - 1)
						mata[i + 1][0] = mat[i][j];
					else
						mata[i][j + 1] = mat[i][j];
				}
			}

			mat = mata;
			mata=new int[mat.length][mat[0].length];
		}

		for (int[] val1 : mat) {
			for (int val : val1)
				System.out.print(val + " ");

			System.out.println();
		}

	}
}
