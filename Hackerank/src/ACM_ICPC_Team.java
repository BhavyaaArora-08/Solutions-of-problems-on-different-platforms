import java.util.ArrayList;
import java.util.List;

public class ACM_ICPC_Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "10101", "11100", "11010", "00101" };
		int[] ans=find(arr);
		for(int val:ans)
			System.out.println(val);
	}
	
	public static class pair{
		ArrayList<Integer> zero;
		int max;
	}
	
	public static int[] finda(String[] arr)
	{
		pair[] hey=new pair[arr.length];
		int[] ans=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			hey[i]=new pair();
			hey[i].zero=new ArrayList<Integer>();
			int c=0;
			
			for(int j=0;j<arr[i].length();j++)
			{
				if(arr[i].charAt(j)=='1')
					c++;
				
				else
					hey[i].zero.add(i);
			}
			
			hey[i].max=c;		
		}
		
		
		
		return ans;
	}

	public static int[] find(String[] arr) {
		int[] ans = new int[2];
		List<List<Integer>> ll = new ArrayList<>();
		int max=0;

		for (int i = 0; i < arr.length-1; i++)
		{
			
			for (int j = i + 1; j < arr.length; j++)
			{
				List<Integer> l = new ArrayList<>();
				int k = 0;
				while (k < arr[i].length()) 
				{
//					System.out.println(arr[i].charAt(i));
					
					if (arr[i].charAt(k) == '1' || arr[j].charAt(k) == '1')
						l.add(k + 1);

					k++;
				}
				ll.add(l);
				max=Math.max(max, l.size());
//				System.out.println(l);
			}

			
		}

		int c=0;
		
		for(List<Integer> l:ll)
			if(l.size()==max)
				c++;
			
//		System.out.println(ll);
		ans[0]=max;
		ans[1]=c;
		
		return ans;
	}
}
