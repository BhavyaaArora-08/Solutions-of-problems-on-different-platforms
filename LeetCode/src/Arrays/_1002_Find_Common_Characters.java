package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1002_Find_Common_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"cool","lock","cook"};
		System.out.println(comn(arr));
	}

	public static List<String> comn(String[] arr) {
		HashMap<Character, Boolean> map = new HashMap();
		String temp = arr[0];
		ArrayList<Character> otherList = new ArrayList<>();
		
		for (int i = 0; i < temp.length(); i++)
			map.put(temp.charAt(i), true);

		for (int i = 1; i < arr.length; i++) {
			String str = arr[i];
			HashMap<Character, Boolean> mapa = new HashMap();
			
			for (int j = 0; j < str.length(); j++)
				mapa.put(str.charAt(j), true);

//			System.out.println(mapa);
			
			for (Character key : map.keySet()) {
				if (!mapa.containsKey(key))
				{
					otherList.add(key);
				}
			}
			
			for(Character e : otherList){
			    map.remove(e);
			}
			
//			System.out.println(map);
//			System.out.println();
//
//			if (map.size() == 0)
//				break;

		}
		
		List<String> ans = new ArrayList<>();
		for (Character key : map.keySet()) {
			ans.add(key+"");
		}
		
		return ans;

	}

}
