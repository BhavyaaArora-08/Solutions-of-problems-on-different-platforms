package _20th_March_2020;

public class _231_Power_of_Two_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(one(-16));
	}
	
	public static boolean one(int n)
	{
		while(n>=2)
		{
			if(n%2!=0)
				return false;
			
			n/=2;
		}
		
		if(n==1)
			return true;
		else
			return false;
			
	}

}
