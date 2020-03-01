import java.util.HashMap;
import java.util.Scanner;

public class _Equalize_Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=obj.nextInt();	
		
		System.out.println(find(arr));
	}
	
	public static int find(int[] arr)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		int max=0;
		int ans=0;
		
		for(int key:map.keySet())
		{
			int x=map.get(key);
			max=Math.max(max, x);
			ans+=x;
		}
		
		return ans-max;
		
		
	}

}
