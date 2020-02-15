import java.util.HashMap;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun");
	}
	
	public static void find(String str)
	{
		HashMap<Character, Boolean> map=new HashMap<Character, Boolean>();
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
				map.put(ch,true);
		}
		
		//System.out.println(map);
		
		if(map.size()==26)
			System.out.println("panagram");
		else
			System.out.println("not panagram");
	}

}
