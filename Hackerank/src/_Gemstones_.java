import java.util.HashMap;

public class _Gemstones_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "abcdde", "baccd", "eeabg" };
		System.out.println(find(arr));

	}

	public static int find(String[] arr) {
		int c = 0;
		HashMap<Character, Boolean> mapa = new HashMap();
		String str = arr[0];

		for (char ch : str.toCharArray())
			mapa.put(ch, true);

		for (String val : arr) {
			HashMap<Character, Boolean> map = new HashMap();
			
			for (char ch : val.toCharArray())
				map.put(ch, true);
			
			System.out.println(map);

			for (Character key : mapa.keySet()) {
				if (!map.containsKey(key))
					mapa.put(key, false);
			}

		}
		
		System.out.println(mapa);
		for (Character key : mapa.keySet()) {
			if (mapa.get(key) == true)
				c++;
		}

		return c;
	}

}
