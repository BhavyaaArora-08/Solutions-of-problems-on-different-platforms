package Serial_Order_Wise;

import java.util.LinkedList;

public class _20_Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perf("(("));
	}

	public static boolean perf(String s) {
		LinkedList<Character> stack = new LinkedList<Character>();

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(isOpening(ch))
				stack.push(ch);
			else
			{
				if(stack.isEmpty())
					return false;
				char check=stack.pop();
				if(ch!=opp(check))
					return false;
			}
		}
		
		if(stack.isEmpty())
			return true;
		
		return false;

	}

	public static boolean find(String s) {
		LinkedList<Character> stack = new LinkedList<Character>();

		int i = 0;

		while (i != s.length()) {
			while (isOpening(s.charAt(i))) {
				stack.push(s.charAt(i));
				i++;
			}

			int flag = 0;

			while (!stack.isEmpty() && opp(stack.pop()) == s.charAt(i)) {
				i++;
				flag = 1;
			}

			if (flag == 0)
				return false;

		}

		return true;
	}

	private static Character opp(char ch) {
		// TODO Auto-generated method stub
		if (ch == '{')
			return '}';
		if (ch == '[')
			return ']';
		if (ch == '(')
			return ')';

		return null;
	}

	private static boolean isOpening(char ch) {
		// TODO Auto-generated method stub

		if (ch == '{' || ch == '(' || ch == '[')
			return true;

		return false;
	}

}
