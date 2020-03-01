import java.util.HashMap;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(find(
//				"aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb"));
		
		System.out.println(find("cdeabc"));
	}

	public static int find(String str) {
		if (str.length() % 2 != 0)
			return -1;

		String one = str.substring(0, str.length() / 2);
		String two = str.substring(str.length() / 2);
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
//		System.out.println(one + " " + two);
		
		int c1 = 0;

		for (int i = 0; i < one.length(); i++) {
			map1.put(one.charAt(i), map1.getOrDefault(one.charAt(i), 0) + 1);
		}

		for (int i = 0; i < two.length(); i++) 
		{
			char ch = two.charAt(i);
			if (!map1.containsKey(ch) || map1.get(ch)==0) 
			{
				c1++;
			} 
			else
			{
				map1.put(ch, map1.get(ch)-1);
				if (map1.get(ch) == null)
					map1.remove(ch);
			}
			
			//System.out.println(map1);

		}

		return 2*c1;
	}

}
