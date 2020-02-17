package Arrays;



import java.util.Stack;

public class Three_LongestSubstring {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		stack2=(Stack<Integer>) stack.clone();
		System.out.println(maxLength("abcabcbb"));
	}
	
	public static int maxLength(String s)
	{
		if(s.length()==1)
		{
			return 1;
		}
		
		int rr=maxLength(s.substring(1));
		
		char ch=s.charAt(0);
		int i=1,t=0;
		String so="";
		
		System.out.print(ch);
		while(i<s.length() && ch!=s.charAt(i))
		{
			
			i++;
			t++;
		}
		System.out.println();
		
		return Math.max(t, rr);
	}
}
