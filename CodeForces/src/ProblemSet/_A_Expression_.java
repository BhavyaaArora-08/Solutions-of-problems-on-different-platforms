package ProblemSet;

import java.util.Scanner;

public class _A_Expression_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();

		int x = a + (b * c);
		int y = a * (b + c);
		int z = a * b * c;
		int k = (a + b) * c;
		int m = (a * b) + c;
		int n = a + b + c;
		
		System.out.println(Math.max(x, Math.max(y, Math.max(z,Math.max(k, Math.max(m, n))))));
		
	}

}
