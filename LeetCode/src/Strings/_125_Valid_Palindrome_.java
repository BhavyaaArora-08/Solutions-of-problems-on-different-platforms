package Strings;

public class _125_Valid_Palindrome_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Solution {
	    public boolean isPalindrome(String s) {
	        int start = 0; 
	        int end = s.length() - 1;
	        while(start <= end) {
	            while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
	                start++;
	            }
	            while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
	                end--;
	            }
	            if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }
	}
	
	public static boolean find(String s) {
		s = s.toLowerCase();
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (Character.isLetter(ch) || Character.isDigit(ch))
				temp += ch;
		}

		if(temp.length()%2!=0)
            return false;
		
		int i = 0, j = temp.length() - 1;

		while (i < j) {
			
			if(temp.charAt(i) != temp.charAt(j))
				return false;
			
			i++;
			j--;
		}
		
		return true;

	}

}
