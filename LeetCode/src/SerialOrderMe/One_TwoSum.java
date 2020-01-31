package SerialOrderMe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class One_TwoSum {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int[] nums = { 0, 3, 3, 4, -1 };
		int target = 6;

		int[] x = twoSum(nums, target);
		for (int val : x)
			System.out.println(val);
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			Integer diff = (Integer) (target - nums[i]);
			if (hash.containsKey(diff)) {
				int toReturn[] = { hash.get(diff), i };
				System.out.println(hash);
				return toReturn;
			}
			hash.put(nums[i], i);
			System.out.println(hash);
		}

		return null;
	}

}