import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _212_Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		
		HashMap<String, Boolean> words=new HashMap<String, Boolean>();
		words.put("oath", true);
		words.put("pea", true);
		words.put("rain", true);
		words.put("eat", true);
		
		find(0, 0, board.length-1, board[0].length-1, "", board, words);
		System.out.println(ll);
	}

	public static List<String> ll = new ArrayList<>();

	public static void find(int rc, int cc, int tr, int tc, String str, char[][] board,
			HashMap<String, Boolean> words) {
		
//		System.out.println(str);
		
		if (words.containsKey(str))
		{
			ll.add(str);
			return;
		}
		
		if((rc > tr || cc > tc || rc<0 || cc<0))
			return;
		
		if ((rc == tr && cc == tc))
			return;

		if(cc==tc)
			find(rc+1, 0, tr, tc, str + board[rc][cc], board, words);
		
		find(rc, cc + 1, tr, tc, str + board[rc][cc], board, words);
		find(rc + 1, cc, tr, tc, str + board[rc][cc], board, words);
		find(rc - 1, cc, tr, tc, str + board[rc][cc], board, words);
		find(rc, cc - 1, tr, tc, str + board[rc][cc], board, words);
		
		find(rc + 1, cc, tr, tc, str, board, words);
		find(rc, cc + 1, tr, tc, str, board, words);
		find(rc - 1, cc, tr, tc, str, board, words);
		find(rc, cc - 1, tr, tc, str, board, words);

	}
}
