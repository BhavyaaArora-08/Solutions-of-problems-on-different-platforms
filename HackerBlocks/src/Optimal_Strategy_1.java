import java.util.LinkedList;
import java.util.Scanner;

public class Optimal_Strategy_1 {
	public static void main(String[] args) {
		LinkedList<Integer> staque=new LinkedList<Integer>();
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		for(int i=0;i<n;i++)
			staque.add(obj.nextInt());
		
		int piyush=0;
		int nimit=0;
		int i=0;
		
		while(!staque.isEmpty())
		{
			int t1=staque.getLast();
			int t2=staque.getFirst();
			
			if(i%2==0)
			{
				if(t1>t2)
				{
					piyush+=t1;
					staque.removeLast();
				}
				else
				{
					piyush+=t2;
					staque.removeFirst();
				}
			}
			else
			{
				if(t1>t2)
				{
					nimit+=t1;
					staque.removeLast();
				}
				else
				{
					nimit+=t2;
					staque.removeFirst();
				}
			}
			
			i++;
		}
		
		System.out.println(piyush);
	}

}
