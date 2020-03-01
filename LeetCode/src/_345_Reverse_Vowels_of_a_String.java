
public class _345_Reverse_Vowels_of_a_String {

	public static Integer val;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("a."));
	}
	
	
	public static String find(String s)
	{
		int i=0,j=s.length()-1;
		
		char[] ans=s.toCharArray();
		
		while(i<=j)
		{
			while(i<s.length() && !isVowel(s.charAt(i)))
				i++;
			
			
			while(j>=0 && !isVowel(s.charAt(j)))
				j--;
			
			if(i==s.length() || j<0 || i>=j)
				break;
			
			
			char ch=ans[i];
			ans[i]=ans[j];
			ans[j]=ch;
			
			
			i++;
			j--;
		}
		
		return new String(ans);
		
	}

	public static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			return true;
		
		return false;
	}
}
