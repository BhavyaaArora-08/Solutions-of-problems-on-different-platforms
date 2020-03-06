package ProblemSet;

import java.util.Scanner;

public class _A_HQ9_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		String str = obj.next();
		int flag = 0;

		for (char ch : str.toCharArray()) {
			if (ch >= 33 && ch <= 126) {
				if (ch == 'H' || ch == 'Q' || ch == '9') {
					System.out.println("YES");
					flag = 1;
					break;
				}
			}
		}

		if (flag == 0)
			System.out.println("NO");
	}

}
