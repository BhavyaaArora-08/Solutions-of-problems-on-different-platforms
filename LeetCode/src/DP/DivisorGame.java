package DP;

public class DivisorGame {
	public static void main(String[] args) {
		System.out.println(find(4, 0, ""));
	}

	public static boolean find(int n, int c, String str) {
		if (n == 1) {
			if (c % 2 == 0) {
				System.out.println(str);
				return false;
			}

			else {
				System.out.println(str);
				return true;
			}
		}

		boolean b = true;

		if (c % 2 == 0)
			str += "Alice";
		else
			str += "Bob";

		// Move two
		for (int i = 1; i <= n; i++) {
			b = b && find(n - i, c + 1, str + (n - i));

		}

		// Move one
		for (int i = n - 1; i >= 1; i--) {
			if (n % i == 0)
				b = b && find(i, c + 1, str + i);
		}

		return b;

	}
}
