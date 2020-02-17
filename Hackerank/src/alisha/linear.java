package alisha;
import java.util.Scanner;
public class linear {
public static void main()
{ Scanner scn = new Scanner(System.in);
	int[] a= { 10,20,30,40,50};
	int n = scn.nextInt();
	System.out.print(linear(a,n));
	
}

public static int linear(int[] a,int n) {
	for (int i = 0 ; i <a.length;i++)
	{
		if(a[i]==n)
			return n;
	}
	return -1;
}
	
}
