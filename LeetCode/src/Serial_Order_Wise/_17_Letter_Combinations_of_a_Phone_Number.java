package Serial_Order_Wise;

import java.util.ArrayList;
import java.util.List;

public class _17_Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(find(0, "23"));
	}
	
	public static List<String> find(int vidx,String digits)
	{
		if(vidx==digits.length())
		{
			List<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		
		
		char ch=digits.charAt(vidx);
		List<String> rr=find(vidx+1, digits);
		ArrayList<Character> code=code(ch);
		
		List<String> mr=new ArrayList();
		
		for(int i=0;i<code.size();i++)
		{
			char put=code.get(i);
			for(String val:rr)
			{
				mr.add(put+val);
			}
		}
		
		return mr;
		
	}
	
	
	public static ArrayList<Character> code(char ch1)
	{
		ArrayList<Character> ll=new ArrayList();
		int ch=Integer.parseInt(ch1+"");
				
		if(ch==2)
		{
			ll.add('a');
			ll.add('b');
			ll.add('c');
		}
		else if(ch==3)
		{
			ll.add('d');
			ll.add('e');
			ll.add('f');
		}
		else if(ch==4)
		{
			ll.add('g');
			ll.add('h');
			ll.add('i');
		}
		else if(ch==5)
		{
			ll.add('j');
			ll.add('k');
			ll.add('l');
		}
		else if(ch==6)
		{
			ll.add('m');
			ll.add('n');
			ll.add('o');
		}
		else if(ch==7)
		{
			ll.add('p');
			ll.add('q');
			ll.add('r');
			ll.add('s');
		}
		else if(ch==8)
		{
			ll.add('t');
			ll.add('u');
			ll.add('v');
		}
		else if(ch==9)
		{
			ll.add('w');
			ll.add('x');
			ll.add('y');
			ll.add('z');
		}
		
		
		return ll;
		
	}

}
