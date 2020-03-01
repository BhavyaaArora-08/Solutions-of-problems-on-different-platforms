import java.util.ArrayList;
import java.util.List;

public class _412_Fizz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static List<String> find(int n)
	{
		
		List<String> ll=new ArrayList();
		
		for(int i=1;i<=n;i++)
		{
			String temp="";
			
			if(i%3==0)
				temp+="Fizz";
			if(i%5==0)
				temp+="Buzz";
			
			if(temp.length()==0)
				temp=i+"";
			
			ll.add(temp);
		}
		
		return ll;
		
	}

}
