import java.util.Arrays;

public class _1323_Maximum_69_Number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(one(9669));
	}

	public static int one(int n)
	{
		String str=n+"";
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='6')
			{
				arr[i]='9';
				break;
			}
		}
		
		String x="";
		for(char ch:arr)
			x+=(ch+"");
		
		return Integer.parseInt(x);
	}
}
