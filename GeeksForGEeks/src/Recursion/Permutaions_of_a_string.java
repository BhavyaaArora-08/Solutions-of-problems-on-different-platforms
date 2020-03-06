package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permutaions_of_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			String q=obj.next();
			ll=new ArrayList<String>();
			perms("", q);
			Collections.sort(ll);
			for(String val:ll)
				System.out.print(val+" ");
			
			System.out.println();
			
		}
	}

	public static ArrayList<String> ll = new ArrayList<String>();

	public static void perms(String ans, String str) {

		if (str.length() == 0) {
			ll.add(ans);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		for (int i = 0; i < ans.length() + 1; i++) {
			String s = ans.substring(0, i) + ch + ans.substring(i);
			perms(s, ros);
		}

		return;
	}

}
