
public class The_Power_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(1, 13, 0,2));
	}
	
	
	public static int find(int idx,int x,int sum,int k)
	{
		
		if(sum==x)
			return 1;
		
		if(sum>x || idx>Math.sqrt(x))
			return 0;
		
		
		int x1=find(idx+1,x, sum+(int)Math.pow(idx, k),k);
		int x2=find(idx+1, x, sum,k);
		
		
		return x1+x2;
		
		
		
	}

}
