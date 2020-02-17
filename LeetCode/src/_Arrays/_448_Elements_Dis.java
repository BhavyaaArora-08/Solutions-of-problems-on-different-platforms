import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _448_Elements_Dis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,7,8,2,3,1};
//		System.out.println(find(arr));
		System.out.println(mysol(arr));
	}
	
	public static List<Integer> mysol(int[] arr)
	{
		int[] a=new int[arr.length+1];
		List<Integer> ll=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			a[arr[i]]=1;
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==0)
				ll.add(i);
			
		}
		return ll;
	}
	
	public static List<Integer> find(int[] arr)
	{
		Arrays.sort(arr);
		int n=arr[arr.length-1];
		
		List<Integer> ll=new ArrayList<>();
		HashMap<Integer,Boolean> map=new HashMap<>();
		
		for(int val:arr)
		{
			map.put(val, true);
		}
		
		for(int i=1;i<=n;i++)
		{
			if(!map.containsKey(i))
				ll.add(i);
		}
		
		return ll;
		
	}

}
