package ProblemSet;

import java.math.BigInteger;
import java.util.Scanner;

public class _A_Olesya_and_Rodion_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int t=obj.nextInt();
		String l="";
		int x=n;
		while(x-->0)
			l+=1+"";
		
		x=n;
		String h="";
		while(x-->0)
			h+=9+"";
		
		BigInteger l1=new BigInteger(l);
		BigInteger h1=new BigInteger(h);
		BigInteger t1=new BigInteger(t+"");
		
		int flag=0;
		
		BigInteger i=new BigInteger(l);
		System.out.println(i+" "+l1+" "+h1);
		
		for(;i.compareTo(h1)<=0;i=i.add(BigInteger.ONE))
		{
			if(i.remainder(t1).equals(BigInteger.ZERO))
			{
				flag=1;
				System.out.println(i);
				break;
			}
		}
		
		if(flag==0)
			System.out.println(-1);
	}

}
