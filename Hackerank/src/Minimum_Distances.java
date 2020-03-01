import java.util.Scanner;

public class Minimum_Distances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = obj.nextInt();

		int c = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++)
		{
			int x = arr[i];
			for (int j = i + 1; j < arr.length; j++) 
			{
				if(arr[j]==x)
					c=Math.min(c, j-i);
			}

		}
		
		if(c==Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(c);
	}

}
