import java.util.HashMap;

public class Caeser_Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("middle-Outz", 2));
	}

	public static String find(String s,int k) {
		
		String str="";
		int k1=k%26,k2=k%26;
		
		//System.out.println(k1+" "+k2);
		
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
            if(!Character.isLetter(ch))
                str+=ch;
            else if(Character.isLowerCase(ch))
            {
            	
	            if(k1+ch>'z')
	            {
	                str+=(char)('a'+k1-'z'+ch-1);
	                //System.out.println(k-'z'+s.charAt(i)-1);
	            }
	            else
	                str+=(char)(ch+k1);
            }
            else
            {
            	if(k2+ch>'Z')
	            {
	                str+=(char)('A'+k2-'Z'+ch-1);
	                //System.out.println(k-'z'+s.charAt(i)-1);
	            }
	            else
	                str+=(char)(ch+k2);
            }
        }
        
        return str;
		
	}

}
