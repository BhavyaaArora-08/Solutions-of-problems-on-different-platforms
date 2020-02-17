import java.util.Arrays;
import java.util.HashMap;

public class _217_Contains_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,1,2,3,2,2,2};
		System.out.println(lasttry(arr));
		System.out.println(fifa(arr));
		System.out.println(find(arr));
	}
	
	
	public static boolean lasttry(int[] arr)
	{
		HashMap<Integer,Boolean> map=new HashMap();
		int i=0;
		
		while(i<arr.length)
		{
			map.put(arr[i], true);
			i++;
		}
		
		return map.size()!=arr.length;
	}
	
	public static boolean woah(int[] arr)
	{
		HashMap<Integer,Boolean> map=new HashMap();
		int i=0;
		
		while(i<arr.length)
		{
			map.put(arr[i], true);
			if(map.size()!=i+1)
				return true;
		}
		
		return false;
	}
	
	// TC: O(n)
	public static boolean fifa(int[] arr)
	{
		
		HashMap<Integer,Boolean> map=new HashMap();
		
		for(int val:arr)
		{
			if(map.containsKey(val))
				return true;
			map.put(val, true);
			
		}
		
		return false;
	}
	
	
	public static boolean find(int[] arr)
	{
		
		int i=0;
		Arrays.sort(arr);
		
		while(i<arr.length)
		{
			int c=0;
			int prev=arr[i];
			
			while(arr[i]==prev)
			{
				c++;
				i++;
			}
			
			if(c>=2)
				return true;
			
		}
		
		
		return false;
		
	}

}
