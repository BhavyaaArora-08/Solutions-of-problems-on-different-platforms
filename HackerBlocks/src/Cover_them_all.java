import java.util.Scanner;

public class Cover_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();
		while (t-- > 0) {
			int n = obj.nextInt();
			int[] loc = new int[n];
			int[] bombs = new int[n];

			for (int i = 0; i < n; i++) {
				loc[i] = obj.nextInt();
			}

			for (int i = 0; i < n; i++) {
				bombs[i] = obj.nextInt();
			}

			System.out.println(find(n, loc, bombs));
		}
	}

	public static int find(int n, int[] loc, int[] bombs) {
		int ans = 0;
		for (int si = 0; si < n - 1; si++) {
			for (int ei = si + 1; ei < n; ei++) {
				ans += Math.abs(loc[ei] - loc[si]) * Math.max(bombs[si], bombs[ei]);
			}
		}

		return ans;
	}

}
