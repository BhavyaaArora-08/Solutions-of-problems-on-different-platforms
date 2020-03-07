package ProblemSet;

import java.util.Scanner;

public class _B_T_primes_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();

		while (n-- > 0) {
			long t = obj.nextLong();
			int c=divisors(t);
			if (c == 3)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static int divisors(long x) {
	    long limit = x;
	    int numberOfDivisors = 0;

	    if (x == 1) return 1;

	    for (int i = 1;i < limit; ++i) {
	        if (x % i == 0) {
	            limit = x / i;
	            if (limit != i) {
	                numberOfDivisors++;
	            }
	            numberOfDivisors++;
	            if(numberOfDivisors>3)
	            	return numberOfDivisors;
	        }
	    }

	    return numberOfDivisors;
	}
}
