import java.util.ArrayList;
import java.util.List;

public class _Picking_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,4,4,5,5,5};
		System.out.println(max(arr));
	}
	
	
	public static int max(int[] arr)
	{
		List<Integer> ll=new ArrayList<Integer>();
		int[] a= ll.stream().mapToInt(Integer::intValue).toArray();
		
		int ans=0;
		
		for(int si=0;si<arr.length;si++)
		{
			int c=0;
			for(int ei=si;ei<arr.length;ei++)
			{
				int diff=Math.abs(arr[si]-arr[ei]);
				
				if(diff==1 || diff==0)
					c++;
				else
					break;
			}
			
			ans=Math.max(c, ans);
		}
		
		
		return ans;
		
	}

}
