package _10_Days_Of_code;

import java.util.Scanner;

public class Ganesha_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		print(n);
	}

	public static void print(int n) {
		
		int rows = 1;

		while (rows <= n) 
		{
			int col = 0;

			if (rows <= n / 2) 
			{
				while (col < n)
				{
					if (col == 0 || col == n / 2 || (col>n/2 && rows==1))
						System.out.print("*");
					else
						System.out.print(" ");

					col++;
				}
				
			} 
			else if (rows == (n / 2)+1) 
			{
				while (col < n) 
				{
					System.out.print("*");
					col++;
				}
			} 
			else
			{
				while (col < n) 
				{
					if (col == n-1 || col == n / 2 || (col<n/2 && rows==n))
						System.out.print("*");
					else
						System.out.print(" ");

					col++;
				}
			}

			rows++;
			System.out.println();
		}

	}

}
