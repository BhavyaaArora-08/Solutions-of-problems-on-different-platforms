package Round_A_2019;

import java.util.*;

public class temp {
	public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nst=1,nsp=n,nsp1=1,val=1;
        for(int row=1;row<=n;row++){
        	
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            
            for(int cst=1;cst<=nst;cst++){
                System.out.print(val);
                val--;
            }
            
            for(int csp=2;csp<=nsp1;csp++){
                System.out.print(" ");
            }
            val=1;
            int cst=1;
            if(row==1 || row==n){
                cst=2;
            }
            for(;cst<=nst;cst++){
                System.out.print(val);
                val++;
            }
            val--;
            System.out.println();
            if(row<=n/2){
                nsp-=2;
                val++;
                nst++;
                nsp1+=2;
            }
            else{
                val--;
                nsp+=2;
                nst--;
                nsp1-=2;
            }
        }
    }
}