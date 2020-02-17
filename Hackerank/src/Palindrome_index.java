
public class Palindrome_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("aaab"));
	}

	public static int find(String str) {
		int i = 0, j = str.length() - 1;

		while (i<j && i<str.length() && j>=0 && str.charAt(i)==str.charAt(j)) {
			i++;
			j--;
		}
		if(i>=j)
			return -1;
		int c1=i,c2=j;
		
		i=c1+1;
		j=c2;
		
		//remove ith
		while (i<j && i<str.length() && j>=0 && str.charAt(i)==str.charAt(j)) {
			i++;
			j--;
		}
		
		if(i>=j)
			return c1;
		
		i=c1;
		j=c2-1;
		//remove jth
		while (i<j  && i<str.length() && j>=0 && str.charAt(i)==str.charAt(j)) {
			i++;
			j--;
		}
		if(i>=j)
			return  c2;
		else
			return -1;
		
	}

}
