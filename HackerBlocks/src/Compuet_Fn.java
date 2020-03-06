import java.util.Scanner;

public class Compuet_Fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		long t=obj.nextLong();
		
		while(t-->0)
		{
			long n=obj.nextLong();
			long i=1l;
			long ans=0l;
			while(i<=n)
			{
				if(i%2l==0l)
					ans+=i;
				else
					ans-=i;
				
				i++;
			}
			
			System.out.println(ans);
		}
	}

}
