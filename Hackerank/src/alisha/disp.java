package alisha;
import java.util.Scanner;

public class disp {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] a= takeinput();
		display(a);
	}

public static int[] takeinput()
{ 
	System.out.println("Size");
	int n = scn.nextInt();
	int [] arr = new int[5];
	for (int i = 1 ; i < arr.length;i++)
	{ 
		arr[i] = scn.nextInt();
	}
	return arr;	
}
 public static void display(int[]arr)
 {
	 for (int i = 1 ; i < arr.length;i++)
		{ System.out.println(arr[i]);
		}
 }
}


