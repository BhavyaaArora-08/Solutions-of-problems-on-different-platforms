package ProblemSet;

import java.util.Scanner;

public class _A_WaterMelon_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int w=obj.nextInt();
		
		if(w%2==0 && w>2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
