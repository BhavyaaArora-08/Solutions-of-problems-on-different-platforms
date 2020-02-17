package alisha;
import java.util.Scanner;
public class max {

		public static void main()
		{
			int [] a= {10,20,30,40,50 };
			
		max(a);
		}
	public static int max(int[] a)
	{ 	int maxi= Integer.MIN_VALUE;
		for (int i = 0 ; i < a.length;i++)
			{
				if (a[i] > maxi)
				maxi = a[i];
			}
		return maxi;
	}
}

