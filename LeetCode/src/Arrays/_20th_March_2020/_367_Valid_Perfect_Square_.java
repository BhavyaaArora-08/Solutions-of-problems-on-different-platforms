package _20th_March_2020;

public class _367_Valid_Perfect_Square_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(one(16));
	}
	
	public static boolean one(int n)
	{
		double x=Math.sqrt(n);
		if(x-(int)Math.sqrt(n)==0)
			return true;
		else
			return false;
	}

}
