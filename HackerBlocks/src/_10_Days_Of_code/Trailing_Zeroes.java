package _10_Days_Of_code;

import java.util.Scanner;

public class Trailing_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println(find(obj.nextInt()));
	}
//
	public static int find(int n) {
		int count = 0;
	
//		Trailing 0s in n! = Count of 5s in prime factors of n!
//                = floor(n/5) + floor(n/25) + floor(n/125) + ....
                
		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		return count;
	}

}
