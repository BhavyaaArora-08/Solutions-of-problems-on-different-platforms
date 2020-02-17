import java.util.ArrayList;
import java.util.HashMap;

public class _349_Intersection_of_two_arrays_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {4,9,5};
		int[] arr2= {9,4,9,8,4};
		
		int[] arr=inter(arr1, arr2);
		for(int val:arr)
			System.out.println(val);
	}
	
	
	public static int[] inter(int[] arr1,int[] arr2)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		HashMap<Integer, Boolean> mapa=new HashMap<Integer, Boolean>();
		
		ArrayList<Integer> ll=new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
			map.put(arr1[i],i);
		
		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]) && !mapa.containsKey(arr2[i]))
			{
				ll.add(arr2[i]);
				mapa.put(arr2[i], true);
			}
		}
		
		int[] arr = ll.stream().mapToInt(i->i).toArray();
		
		return arr;
		
		
	}
	
	
//	public static int[] inter2(int[] nums1,int[] nums2)
//	{
//		
//	}

}
