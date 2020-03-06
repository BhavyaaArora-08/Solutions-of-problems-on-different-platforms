package ProblemSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _B_Taxi_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			arr[i] = obj.nextInt();
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

//		System.out.println(map);

		Arrays.sort(arr);

		int c = 0;
		int sum = 0;
		int x = 0;

		for (int i = 0;; i++) {
			if (sum == 4 || i == n) {
//				System.out.println();
				c++;
				sum = 0;
				i = 0;
				continue;
			}

			if (map.get(arr[i]) > 0 && map.containsKey(4 - arr[i]) && map.get(4 - arr[i]) > 0) {
				map.put(arr[i], map.get(arr[i]) - 1);
				if (map.get(4 - arr[i]) > 0) {
					map.put(4 - arr[i], map.get(4 - arr[i]) - 1);

//					System.out.println(arr[i] + " " + (4 - arr[i]) + " " + map);
					i = 0;
					x += 2;
//				System.out.println(x);
					c++;
					continue;
				}
				map.put(arr[i], map.get(arr[i]) + 1);
			}

//			System.out.println(x);
			
			if (x == n)
				break;

			if (map.get(arr[i]) > 0 && sum + arr[i] <= 4) {
				sum += arr[i];
//				System.out.print(arr[i]+" ");
				map.put(arr[i], map.get(arr[i]) - 1);
//				System.out.println(sum + " " + map);
				x++;
			}

		}

		System.out.println(c);

	}

	public static int find(int[] arr) {
		int c = 0;

		return c;
	}

}
