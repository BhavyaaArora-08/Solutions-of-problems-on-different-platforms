package ProblemSet;

import java.util.HashMap;
import java.util.Scanner;

public class _I_Deja_vu_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int k = obj.nextInt();
		String str = obj.next();

		HashMap<String, Boolean> map = new HashMap<String, Boolean>();

		if (k != 0) {
			for (int i = 0; i <= n - k; i++) {
				String sub = str.substring(i, i + k);
				map.put(sub, true);
			}
		}

		System.out.println(map.size());
	}

}
