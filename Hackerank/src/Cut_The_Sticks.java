import java.util.Arrays;
import java.util.Scanner;

public class Cut_The_Sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = obj.nextInt();

		Arrays.sort(arr);
		int c = arr.length;
		
//		6
//		5 4 4 2 2 8
		int prevc=-1;
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(prevc!=c)
				System.out.println(c);
			
			prevc=c;
			int x=arr[i],y=0;
			if(x==0)
				continue;
			int prev=arr[i+1]-arr[i];
			
			for (int j = i + 1; j < arr.length; j++)
			{
				arr[j]-=x;
				
				if(prev==0 && arr[j]!=0)
				{
					y=0;
					prev=arr[j];
				}
				
				if(arr[j]==prev)
					y++;
				
				if(arr[j]==0)
					c--;

			}
			
			c--;
			if(y==c)
				break;			
			
						
		}
		
		System.out.println(c);
		
		
	}

}
