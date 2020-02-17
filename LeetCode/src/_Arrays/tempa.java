import java.util.*;
public class tempa {
    public static void main (String args[]) {
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int nst=N/2+1;
        int nsp=-1;
        int row=1;
        while(row<=N){
        	
        	int cst=1;
        	if(row==1 || row==N)
        		cst=2;
            for(; cst<=nst; cst++){
                System.out.print("*\t");
            }
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" \t");
            }
            for(cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            System.out.println();
            if(row<=N/2){
                nsp=nsp+2;
                nst=nst-1;
            }else{
                nsp=nsp-2;
                nst=nst+1;
            }
            row=row+1;
        }
    }
}