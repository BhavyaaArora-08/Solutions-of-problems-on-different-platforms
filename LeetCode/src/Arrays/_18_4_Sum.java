import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_4_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> fourSum(int[] arr, int target) {
		Arrays.sort(arr);
		int n = arr.length;
		List<List<Integer>> ll = new ArrayList<>();

		for (int i = 0; i < n; i++) 
		{
			if (i == 0 || (arr[i] != arr[i - 1]))
			{
				for (int j = i + 1; j < n; j++) 
				{
					if ((arr[j] != arr[j - 1])) 
					{
						int l = j + 1, r = n - 1;
						if (arr[i] > 0)
							break;

						while (l < r)
						{
							int sum = arr[i] + arr[j] + arr[l] + arr[r];

							if (sum > target)
								r--;

							else if (sum < 0)
								l++;

							else 
							{
								ll.add(Arrays.asList(arr[i], arr[j], arr[l], arr[r]));

								while (l < r && arr[l] == arr[l + 1])
									l++;
								while (l < r && arr[r] == arr[r - 1])
									r--;

								l++;
								r--;
							}
						} // End of while
					} // End of first if
				}
			}
		}
		return ll;
	}

}
