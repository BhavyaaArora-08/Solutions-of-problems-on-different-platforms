
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		long n = obj.nextLong();
		long k = obj.nextLong();

		if(k<=n/2 || (k==(n/2)+1 && n%2!=0))
		{
			long ans=(2*k) - 1;
			System.out.println(ans);
		}
		else 
		{
			if(n%2==0)
			{
				long ans=2+(k-(n/2)-1)*2;
				System.out.println(ans);
			}
			else 
			{
				long ans=2+(k-(n/2)-2)*2;
				System.out.println(ans);
			}
					
		}

		
	}
}
