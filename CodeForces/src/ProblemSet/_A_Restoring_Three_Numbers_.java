package ProblemSet;

import java.util.Arrays;
import java.util.Scanner;

public class _A_Restoring_Three_Numbers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		int[] arr=new int[4];
		for(int i=0;i<4;i++)
			arr[i]=obj.nextInt();
		
		Arrays.sort(arr);
		
		int m=arr[3];
		int a=m-arr[0];
		int b=m-arr[1];
		int c=m-arr[2];
		
		System.out.println(a+" "+b+" "+c);
	}

}
