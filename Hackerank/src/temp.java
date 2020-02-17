import java.util.*;
public class temp {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //no. of rows
        int row = 1;
        int nsp = N - 1;
        int nst = 1;
        int val = 1;
        while(row <= 2 * N - 1){
            //work
            //spaces
        	int val1=val;
            for(int csp = 1;csp <= nsp;csp++){
                System.out.print(" \t");
            }
            //stars
            for(int cst = 1;cst <= nst;cst++){
                System.out.print(val1 + "\t");
                if(cst <= nst/2){
                    val1++;
                } else {
                    val1--;
                }
            }
            //preparation
            System.out.println();
            if (row <  N) {
                nsp--;
                nst+=2;
                val++;
            } else {
                nsp++;
                nst-=2;
                val--;
            }
            row++;
        }
    }
}