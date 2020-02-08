import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Between_Two_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		
		b.add(16);
		b.add(32);
		b.add(96);
		
		System.out.println(find(a, b));
		
	}
	
	
	public static int find(List<Integer> a,List<Integer> b)
	{
		List<Integer> ll=new ArrayList<Integer>();
		
		int t=1;
		
		for(int val:a)
			t*=val;
		
		Collections.sort(b);
		
		int lim=b.get(0);
		boolean bool=false;
		
		for(int i=lim;i>=1;i--)
		{
			bool=isFact(b,i); 
			if(bool)
			{
				bool=isFact(i, a);
				if(bool)
					ll.add(i);
			}
		}
		
		
		
		return ll.size();
		
	}


	//i ke factors saare a ke elements hai ya nahi
	private static boolean isFact(int i, List<Integer> a) {
		// TODO Auto-generated method stub
		for(int val:a)
		{
			if(i%val!=0)
				return false;
		}
		
		return true;
	}


	//i b ka factor hai ya nahi
	private static boolean isFact(List<Integer> b, int i) {
		// TODO Auto-generated method stub
		
		for(int val:b)
		{
			if(val%i!=0)
				return false;
		}
		
		return true;
	}

}
