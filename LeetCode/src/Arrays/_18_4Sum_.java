import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class _18_4Sum_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -3,-2,-1,0,0,1,2,3};
		one(0, arr, 0, 0, 0, new ArrayList<Integer>());
		System.out.println(list);
		
	}
	
	static List<List<Integer>> list=new ArrayList<List<Integer>>();
	static HashMap<String, Boolean> map=new HashMap<String, Boolean>();
	
	public static void one(int vidx,int[] arr,int target,int sum,int c,ArrayList<Integer> ll)
	{
		if(sum==target && c==4)
		{
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int val:ll)
				l.add(val);
			Collections.sort(l);
			if(!map.containsKey(l.toString()))
			{
				list.add(l);
				map.put(l.toString(), true);
			}
			return;
		}
		
		if(vidx==arr.length)
			return;
		
		ll.add(arr[vidx]);
		one(vidx+1, arr, target, sum+arr[vidx],c+1,ll);
		ll.remove(ll.size()-1);
		one(vidx+1, arr, target, sum,c,ll);
			
		
	}

}
