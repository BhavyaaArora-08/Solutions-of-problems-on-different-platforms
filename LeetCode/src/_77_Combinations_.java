import java.util.ArrayList;
import java.util.List;

public class _77_Combinations_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(1, 4, 3, new ArrayList<Integer>());
		System.out.println(list);
	}
	
	public static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	
	public static void find(int i,int n,int k,ArrayList<Integer> ll)
	{
		
		if(k==0)
		{
			list.add(ll);
			//System.out.println(ll);
			System.out.println(list);
			return;
		}
		
		if(k<0 || i>n)
			return;
		
		ll.add(i);
		find(i+1,n, k-1, ll);
		ll.remove(ll.size()-1);
		
		find(i+1, n, k, ll);
		
		
		
	}

}
