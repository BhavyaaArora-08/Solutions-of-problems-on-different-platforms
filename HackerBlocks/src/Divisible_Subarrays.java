import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int n=obj.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=obj.nextInt();
			}
			
			System.out.println(find(n,arr));	 
		}
		

	}
	
	public static int find(int n,int[] arr)
	{
		
		int ans=0;
		
//		for(int si=0;si<n;si++)
//		{
//			int sum=0;
//			for(int ei=si;ei<n;ei++)
//			{
//				sum+=arr[ei];
//				if(sum%n==0)
//					ans++;
//			}
//		}
		
		int result=0;
		
		for (int i=0; i<n; i++) 
		{
            result += (arr[i] * (i+1) * (n-i)); 
            if(result%n==0)
            	ans++;
		}
		return ans;
		
	}

}
