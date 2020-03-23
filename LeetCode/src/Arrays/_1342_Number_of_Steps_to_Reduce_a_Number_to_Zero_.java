
public class _1342_Number_of_Steps_to_Reduce_a_Number_to_Zero_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(one(14));
	}
	
	public static int one(int n)
	{
		int c=0;
		
		while(n>0)
		{
			if(n%2==0)
				n/=2;
			else
				n--;
			
			c++;
		}
		
		return c;
	}

}
