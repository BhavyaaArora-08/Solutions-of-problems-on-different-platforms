import java.util.ArrayList;
import java.util.List;

public class _39_Combination_Sum_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5};
		list=new ArrayList();
		one(0, arr, 8, 0, new ArrayList<Integer>());
		System.out.println(list);
	}

	static ArrayList<ArrayList<Integer>> list=new ArrayList();
	
	public static void one(int vidx,int[] arr,int target,int sum,ArrayList<Integer> ll)
	{
		if(sum==target)
		{
			ArrayList<Integer> l=new ArrayList<Integer>();
			for(int val:ll)
				l.add(val);
			list.add(l);
			
			return;
		}
		
		if(sum>target || vidx==arr.length)
			return;
		
		ll.add(arr[vidx]);
		one(vidx, arr, target, sum+arr[vidx],ll);
		ll.remove(ll.size()-1);
		one(vidx+1, arr, target, sum,ll);
			
		
	}
	
}
