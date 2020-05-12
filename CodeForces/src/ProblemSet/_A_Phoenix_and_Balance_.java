package ProblemSet;

import java.util.Scanner;

public class _A_Phoenix_and_Balance_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);

		int t = obj.nextInt();
		while (t-- > 0) {
			int pile1 = 0, pile2 = 0;
			int n = obj.nextInt();
			int k = n / 2;

			for(int i=1;i<k;i++) {
				pile1+=(int)Math.pow(2, i);
			}
			
			pile1+=(int)Math.pow(2, n);
			
			for(int i=k;i<n;i++) {
				pile2+=(int)Math.pow(2, i);
			}
			
			System.out.println(Math.abs(pile1-pile2));
			
		}

	}

}
