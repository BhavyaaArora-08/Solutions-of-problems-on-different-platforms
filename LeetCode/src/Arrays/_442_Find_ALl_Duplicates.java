import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _442_Find_ALl_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> find(int[] arr) {
		List<Integer> ll = new ArrayList<>();
		Arrays.sort(arr);
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			
		}
		
		return ll;
	}

	public static List<Integer> findDuplicates(int[] arr) {

		List<Integer> ll = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				ll.add(key);
		}

		return ll;
	}

}
