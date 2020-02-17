
public class Append_And_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(find("abcd", "abcdert", 10));

	}

	public static String find(String s, String t, int k) {
		String ans = "";
		int c = 0;
		int i = 0;

		
			int flag=0;
			while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i))
				i++;

			ans += s.substring(0, i);
			if(i==t.length())
			{
				c+=s.length()-ans.length();
				
			}
			
			while (i < s.length() && i < t.length() && s.charAt(i) != t.charAt(i)) {
				ans += s.charAt(i);
				i++;
				flag=1;
			}
			
			if(flag==1)
				c+=(s.length()-ans.length())+(s.length()-i+1);


			if(t.length()>s.length())
				c+=2*(t.length()-s.length());
			
//		System.out.println(c);
		if (c <= k)
			return "Yes";
		else
			return "No";

	}

}
