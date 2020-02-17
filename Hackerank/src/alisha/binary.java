package alisha;

import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		Scanner scn = new Scanner(System.in);
		int item = scn.nextInt();
		System.out.println(binary(a, item));
	}

	public static int binary(int[] a, int item) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (item > a[mid]) {
				low = mid + 1;
			} else if (item < a[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;
	}

}