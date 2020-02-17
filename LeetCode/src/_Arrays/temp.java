import java.util.Scanner;

public class temp {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = scr.nextInt();
		int nsp = n / 2, nst = 1;

		for (int row = 1; row <= n; row++) { //correction 1

			for (int csp = 0; csp < nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst==nst) { //Correction 2
					System.out.print("*");
				}
				else  //Correction 3
					System.out.print(" ");
			}

			System.out.println();

			if (row <= n / 2) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2; //correction 4
			}

		}

	}
}