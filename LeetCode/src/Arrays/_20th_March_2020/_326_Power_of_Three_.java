package _20th_March_2020;

public class _326_Power_of_Three_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean one(int n)
	{
		while(n>=3)
		{
			if(n%3!=0)
				return false;
			n/=3;
		}
		
		if(n==1)
			return true;
		else
			return false;
	}
}
