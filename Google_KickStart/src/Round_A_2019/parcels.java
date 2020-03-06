package Round_A_2019;

import java.util.Scanner;

public class parcels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		
		while(t-->0)
		{
			int r=obj.nextInt();
			int c=obj.nextInt();
			
			char[][] arr=new char[r][c];
			for(int i=0;i<r;i++)
				arr[i]=obj.next().toCharArray();
			
			int min=Integer.MAX_VALUE;
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{					
					if(arr[i][j]=='0')
					{
						
					}
				}
			}
			
		}
	}

}
