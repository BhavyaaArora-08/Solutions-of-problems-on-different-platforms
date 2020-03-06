package Round_H_2019;

import java.util.Scanner;

public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int t = obj.nextInt();
		while (t-- > 0) {
			int n = obj.nextInt();
			int k = 0;
			int prev=obj.nextInt();
			if(prev>=1)
				k=1;
			System.out.print("Case #"+(t+1)+": ");
			System.out.print(k);
			
			for (int i = 1; i < n; i++) {
				
				int x = obj.nextInt();
				
				if(prev==-1)
					prev=x;
				
				if (x > k && prev>k) {
					k++;
					System.out.print(k);
				}
				else
				{
					System.out.print(k);
				}
				
				prev=Math.max(prev, x);
//				System.out.println(prev+" "+x);
				
				
			}
			
			System.out.println();
		}

	}

}
