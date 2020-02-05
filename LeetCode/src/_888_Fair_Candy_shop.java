import java.util.HashMap;

public class _888_Fair_Candy_shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2 }, b = { 1, 3 };
		int[] ans = find(a, b);

		for (int val : ans)
			System.out.print(val + " ");

		System.out.println();
	}

	public static int[] find(int[] a, int[] b) {
		int[] ans = new int[2];

		HashMap<Integer, Boolean> maps = new HashMap<Integer, Boolean>();

		int sum1 = 0, sum2 = 0;

		for (int val : a) {
//			maps.put(val, true);
			sum1 += val;
		}

		for (int val : b) {
//			maps.put(val, true);
			sum2 += val;
		}

		int req = (sum1 + sum2) / 2;

		int[] sma, bga;
		int sms, bgs;
		boolean bool=false;

		if (sum1 > sum2) {
			bga = a;
			bool=true;
			sma = b;
			sms = sum2;
			bgs = sum1;
		} else {
			bga = b;
			sma = a;
			sms = sum1;
			bgs = sum2;
		}

		for (int val : sma)
			maps.put(val, true);

		for (int val : bga) {
			int temp = bgs;
			temp -= val;

			if (maps.containsKey(req - temp)) {
				
				if(bool)
				{
					ans[0]=val;
					ans[1]=req-temp;
				}
				else
				{
					ans[1]=val;
					ans[0]=req-temp;
				}
				
				break;
			}
		}

		return ans;

	}

}
