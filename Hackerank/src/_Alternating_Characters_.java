import java.util.Scanner;

public class _Alternating_Characters_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			System.out.println(find(obj.next()));
		}
	}
	
	
	//Correct
	public static int ans(String s)
	{
		int c=0;
		for(int i=0;i<s.length();)
		{
			char prev=s.charAt(i);
			i++;
			while(i<s.length() && s.charAt(i)==prev)
			{
				c++;
				i++;
			}
			
		
		}
		
		return c;
	}
	
	
	public static int find(String s)
	{
		StringBuilder str=new StringBuilder(s);
		int c=0;
		System.out.println();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int j=i+1;
			while(j<str.length() && str.charAt(j)==str.charAt(i))
			{
				str.deleteCharAt(j);
				System.out.println(str);
				c++;
			}
					
		}
		
		return c;
		
	}

}
