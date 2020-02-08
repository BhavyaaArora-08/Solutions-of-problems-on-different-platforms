
import java.util.Scanner;

public class _11_Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(arr));
	}

	public static int max(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return maxArea;
	}

	public static int maxArea(int[] arr) {
		int ans = Integer.MIN_VALUE;

		for (int si = 0; si < arr.length; si++) {
			for (int ei = arr.length - 1; ei > si; ei--) {
				int temp = (ei - si) * Math.min(arr[ei], arr[si]);
				ans = Math.max(ans, temp);
			}
		}

		return ans;
	}
}
