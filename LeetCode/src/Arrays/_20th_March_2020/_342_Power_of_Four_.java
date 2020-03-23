package _20th_March_2020;

public class _342_Power_of_Four_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(one(8));
		
	}
	
	public static boolean one(int n)
	{
		if(n==-2147483648 || n<4)
			return false;
		
		while(n>=4)
		{
			if(n%4!=0) 
				return false;
			n=n/4;
			System.out.println(n);
		}
		if(n==1)
			return true;
		else
			return false;
	}

}
