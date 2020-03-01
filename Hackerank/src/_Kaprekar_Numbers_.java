import java.math.BigInteger;
import java.util.Scanner;

public class _Kaprekar_Numbers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int p = obj.nextInt();
		int q = obj.nextInt();

		for (int n = p; n <= q; n++) {
			
			if(n/10==0)
			{
				if(n==1 || n==9)
					System.out.print(n+" ");
				continue;
			}
			int x = Integer.toString(n).length();
			BigInteger sq = new BigInteger("1");
			BigInteger na=new BigInteger(n+"");
//			System.out.println(sq);
			sq=na.pow(2);
			String str = sq.toString();
			
//			System.out.println(str);
			if (str.length() / 2 == x) {
				int i = Integer.valueOf(str.substring(0, x));
				int j = Integer.valueOf(str.substring(x));
//				System.out.println(i + " " + j);
				if (i + j == n)
					System.out.print(n+" ");
				
			} else if(str.length()/2==x-1){
				int i = Integer.valueOf(str.substring(0, x - 1));
				int j = Integer.valueOf(str.substring(x - 1));
//				System.out.println(i + " " + j);
				if (i + j == n)
					System.out.print(n+" ");
				
			}

		}

	}

}
