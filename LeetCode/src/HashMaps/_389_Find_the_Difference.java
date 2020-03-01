package HashMaps;

import java.util.HashMap;

public class _389_Find_the_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("abcd", "abcde"));
	}
	
	public static char find(String s,String t)
	{
		HashMap<Character, Integer> map1=new HashMap();
		HashMap<Character, Integer> map2=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			map1.put(ch, map1.getOrDefault(ch,0)+1);
		}
		
		for(int i=0;i<t.length();i++)
		{
			char ch=t.charAt(i);
			map2.put(ch, map2.getOrDefault(ch,0)+1);
		}
		
		for(Character key:map2.keySet())
		{
			if(!map1.containsKey(key) || (map1.get(key)!=map2.get(key)))
				return key;
		}
		
//		System.out.println(map1);
//		System.out.println(map2);
		
		return ' ';
		
	}
	
	public char findTheDifference(String s, String t) {
		char c = 0;
		for (int i = 0; i < s.length(); ++i) {
			c ^= s.charAt(i);
		}
		for (int i = 0; i < t.length(); ++i) {
			c ^= t.charAt(i);
		}
		return c;
	}

}
