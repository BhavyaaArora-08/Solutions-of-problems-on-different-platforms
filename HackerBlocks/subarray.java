package alisha;
import java.util.Scanner;
public class subarray {
public static void main(String[] args) 
{
	int[] a = {10,20,30,40,50};
	subarray(a);
}

public static void subarray(int[] a)

{
	for(int si=0;si<a.length;si++)
	{
		for(int ei=0;ei<a.length;ei++) {
			System.out.println(si+ " "+ ei);
			
		for(int k=si;k<=ei;k++)
		
		{
			System.out.print([k] + " ");
		}
		}
		System.out.println();

	}
}

}
