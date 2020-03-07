package ProblemSet;

import java.util.Scanner;

public class _A_Ultra_Fast_Mathematician_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		char[] arr1=obj.next().toCharArray();
		char[] arr2=obj.next().toCharArray();
		String ans="";
	
		for(int i=0;i<arr1.length;i++)
		{
			ans+=(arr1[i]^arr2[i]);
		}
		System.out.println(ans);
	}

}
