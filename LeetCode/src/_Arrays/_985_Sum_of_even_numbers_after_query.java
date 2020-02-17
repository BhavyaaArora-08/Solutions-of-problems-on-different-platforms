import java.util.ArrayList;

public class _985_Sum_of_even_numbers_after_query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };

		int[] ans = find(arr, queries);
		for (int val : ans)
			System.out.println(val);

	}

	public static int[] find(int[] arr, int[][] queries) {
		int[] ans = new int[queries.length];
		int j = 0;

		int es = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				es += arr[i];
		}

		for (int i = 0; i < queries.length; i++) {
			int val = queries[i][0];
			int idx = queries[i][1];
			int temp = arr[idx];

			arr[idx] = arr[idx] + val;

			if (temp % 2 == 0 && arr[idx] % 2 == 0)
				es += val;
			else if (temp % 2 == 0 && arr[idx] % 2 != 0)
				es = es - temp;
			else if (temp % 2 != 0 && arr[idx] % 2 == 0)
				es += arr[idx];

			ans[j++] = es;
		}

		return ans;
	}

}
