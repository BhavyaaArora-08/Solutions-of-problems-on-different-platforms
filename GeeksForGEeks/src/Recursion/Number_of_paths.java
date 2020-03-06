package Recursion;

import java.util.Scanner;

public class Number_of_paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();

		while (t-- > 0) {
			int tr = obj.nextInt();
			int tc = obj.nextInt();
			System.out.println(nop(1, 1, tr, tc));
		}
	}

	public static int nop(int r, int c, int tr, int tc) {
		if (r == tr && c == tc)
			return 1;

		if (r > tr || c > tc)
			return 0;

		int rr1 = nop(r + 1, c, tr, tc);
		int rr2 = nop(r, c + 1, tr, tc);

		return rr1 + rr2;
	}
}
