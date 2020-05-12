package ProblemSet;
import java.util.Scanner;

public class _A_Fafa_and_his_Company_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int c=1;
		
		for(int i=2;i<=n/2;i++) {
			
			int l = i; 
			int tn = n-l;
			
			if(tn%l == 0) {
				c++;
			}			
			
		}
		System.out.println(c);
		
	}

}
