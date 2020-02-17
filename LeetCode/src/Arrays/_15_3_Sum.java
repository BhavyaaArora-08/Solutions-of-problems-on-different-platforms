import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class _15_3_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -2,0,1,1,2 };
		//System.out.println(find(arr));
		System.out.println(best(arr));
	}
	
	// TC:O(n^2)
	public static List<List<Integer>> doubt(int[] arr)
	{
		Arrays.sort(arr);
		int n = arr.length;
		List<List<Integer>> ll = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
            if (i == 0 || (i > 0 && arr[i] != arr[i-1]))
            {
			int l=i+1,r=n-1;
			if(arr[i]>0)
				break;
			
			while(l<r)
			{
				int sum=arr[i]+arr[l]+arr[r];
				
				if(sum>0)
					r--;
				
				else if(sum<0)
					l++;
				
				else
				{
					ll.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    
                    while (l < r && arr[l] == arr[l+1])
                        l++;
                    while (l < r && arr[r] == arr[r-1])
                        r--;
                    
					l++;
					r--;
					
					
				}
			}
            }
		}
		
		return ll;
	}

	// TC:O(n^2) but used an hashmap for checking duplicates in which put and get are of Logn 
	public static List<List<Integer>> best(int[] arr)
	{
		Arrays.sort(arr);
		int n = arr.length;
		List<List<Integer>> ll = new ArrayList<>();
		HashMap<List<Integer>, Boolean> dup = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			int l=i+1,r=n-1;
			if(arr[i]>0)
				break;
			
			while(l<r)
			{
				int sum=arr[i]+arr[l]+arr[r];
//				System.out.println(sum);
				
				if(sum>0)
					r--;
				
				else if(sum<0)
					l++;
				
				else
				{
					List<Integer> kl = new ArrayList<Integer>();
					kl.add(arr[i]);
					kl.add(arr[l]);
					kl.add(arr[r]);
					
					if (!dup.containsKey(kl)) {
						ll.add(kl);
					}
					l++;
					r--;
					dup.put(kl, true);
//					break;
					
				}
			}
			
//			System.out.println(dup);
		}
		
		return ll;
	}

	// TC:O(n^2)
	public static List<List<Integer>> find(int[] arr) {
		List<List<Integer>> ll = new ArrayList<>();
		HashMap<List<Integer>, Boolean> dup = new HashMap<>();
		HashMap<Integer, Integer> all = new HashMap<>();

		for (int i = 0; i < arr.length; i++)
			all.put(arr[i], i);

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int find = 0 - (arr[i] + arr[j]);
				if (all.containsKey(find) && all.get(find) != i && all.get(find) != j) {
					List<Integer> l = new ArrayList<Integer>();
					l.add(arr[i]);
					l.add(arr[j]);
					l.add(find);
					Collections.sort(l);

					if (!dup.containsKey(l)) {
						ll.add(l);
					}

					dup.put(l, true);

				}
			}
			
			
		}

		return ll;

	}

}
