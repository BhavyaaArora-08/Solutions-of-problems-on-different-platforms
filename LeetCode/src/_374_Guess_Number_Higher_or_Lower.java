
public class _374_Guess_Number_Higher_or_Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int find(int n)
	{
		int lo=1;
		int hi=n;
		
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			int x=guess(mid);
			
			if(x==1)
				lo=mid+1;
			else if(x==-1)
				hi=mid-1;
			else
				return mid;
			
		}
		
		return -1;
	}

}
