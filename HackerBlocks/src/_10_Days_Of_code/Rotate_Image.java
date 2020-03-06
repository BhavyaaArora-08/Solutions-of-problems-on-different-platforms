package _10_Days_Of_code;

import java.util.Scanner;

class Solution {
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=obj.nextInt();
        	}
        }
		rotate(arr);
	}
	
    public static void rotate(int[][] matrix) {
        
        int[] arr=new int[matrix.length*matrix.length];
        int c=0;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
                arr[c++]=matrix[i][j];
        }
        
        c=0;
        for(int j=0;j<matrix[0].length;j++)
        {
            for(int i=matrix.length-1;i>=0;i--)
                matrix[i][j]=arr[c++];
               
        }
        
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        	{
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }
        
    }
}