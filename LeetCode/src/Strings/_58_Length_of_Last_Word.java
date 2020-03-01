package Strings;

public class _58_Length_of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("Hello World"));
	}
	
	public static int find(String s)
	{
		
		int si=0,ei=0,x=0;
		
		while(ei<s.length())
		{
			si=ei;
			
			while(ei<s.length() && s.charAt(ei)!=' ')
				ei++;
			
			
			
			x=ei-si;
			
			
			while(ei<s.length() && s.charAt(ei)==' ')
				ei++;
			
		}
		
		return x;
	}

}
