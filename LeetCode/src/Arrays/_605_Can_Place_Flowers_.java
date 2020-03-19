
public class _605_Can_Place_Flowers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,0,0,0,0,0,1};
		System.out.println(one(arr, 2));
	}
	
	//TC: O(n)
	public static boolean one(int[] arr,int n)
	{
		if (arr.length == 1) {
			if ((n == 1 && arr[0] == 0) || n == 0)
				return true;
			else
				return false;
		}
		 
		for(int i=0;i<arr.length && n>0;i++)
		{
			if(arr[i]==0)
			{
				if((i!=0 && i!=arr.length-1) && arr[i-1]==0 && arr[i+1]==0)
				{
					arr[i]=1;
					n--;
				}
				else if(i==0 && arr[i+1]==0)
				{
					arr[i]=1;
					n--;
				}
				else if(i==arr.length-1 && arr[i-1]==0)
				{
					arr[i]=1;
					n--;
				}
			}
		}
		
		if(n==0)
			return true;
		return false;
	}

}
