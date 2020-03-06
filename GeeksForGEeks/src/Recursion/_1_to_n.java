package Recursion;

public class _1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println();
		fun(5);
	}
	
	public static void fun(int n)
	{
		if(n==0)
			return;
		
		fun(n-1);
		System.out.println(n);
		return;
	}

}
