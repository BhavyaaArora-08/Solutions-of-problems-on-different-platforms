
public class Recursive_digit_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sd(9875));
	}

	public static int sd(int x)
	{
		
		if(x/10==0)
			return x;
		
		int sum=0;
		while(x!=0)
		{
			sum+=(x%10);			
			x=x/10;
		}
		
		return sd(sum);
		
	}
}
