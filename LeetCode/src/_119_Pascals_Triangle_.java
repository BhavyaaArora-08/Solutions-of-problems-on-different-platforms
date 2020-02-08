import java.util.ArrayList;
import java.util.List;

public class _119_Pascals_Triangle_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 33; i++)
			System.out.println(i + 1 + ") " + find(i));
	}

	static int fact(int a) {
		int temp = 1;
		while (a != 0) {
			temp *= a;
			a--;
		}
		return temp;
	}

	static int nCr(int x, int y) {
		int temp = fact(x) / (fact(x - y) * fact(y));
		return temp;
	}

	public static List<Integer> find(int n) {

		List<Integer> ll = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
//			System.out.print(nCr(n, i)+" ");
			ll.add(nCr(n, i));
		}
//		System.out.println();

		return ll;

	}

}
