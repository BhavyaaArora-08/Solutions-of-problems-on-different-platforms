import java.util.Arrays;

public class _414_Third_Maximum_Number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// TC: O(nlogn)
	public int thirdMaxa(int[] nums) {
		Arrays.sort(nums);
		int c = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] != nums[i + 1])
				c++;

			if (c == 3)
				return nums[i];
		}

		return nums[nums.length - 1];
	}

	//Slower
	public int thirdMax(int[] nums) {
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;
		for (Integer n : nums) {
			if (n.equals(max1) || n.equals(max2) || n.equals(max3))
				continue;
			if (max1 == null || n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (max2 == null || n > max2) {
				max3 = max2;
				max2 = n;
			} else if (max3 == null || n > max3) {
				max3 = n;
			}
		}
		return max3 == null ? max1 : max3;
	}
	// Third method using heap

}
