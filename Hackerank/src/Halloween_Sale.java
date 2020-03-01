import java.util.Scanner;

public class Halloween_Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		int p=obj.nextInt();
		int d=obj.nextInt();
		int m=obj.nextInt();
		int s=obj.nextInt();
		
		int c=0,sum=0;
		
		while(sum<s)
		{
			if(c==0)
				sum+=p;
			
			else if(p-d>m)
			{
				p=p-d;
				sum+=p;
			}
			else
				sum+=m;
			
			if(sum<=s)
				c++;
		}
		
		System.out.println(c);
	}

}
