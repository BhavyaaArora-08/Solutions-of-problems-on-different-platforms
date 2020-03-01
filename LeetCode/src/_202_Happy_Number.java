import java.util.HashMap;

public class _202_Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(2,new HashMap<Integer, Boolean>()));
	}
	
	
	public static boolean find(int n,HashMap<Integer, Boolean> map)
	{
		
		if(n==1)
			return true;
		else if(n==0)
			return false;
		
		int sum=0;
		
		while(n!=0)
		{
			int rem=n%10;
			sum+=rem*rem;
			n=n/10;
		}
		
		if(map.containsKey(sum))
			return false;
		else
			map.put(sum,true);
		
		return find(sum,map);
		
		
		
		
	}

}
