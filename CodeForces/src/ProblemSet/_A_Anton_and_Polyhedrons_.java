package ProblemSet;

import java.util.Scanner;

public class _A_Anton_and_Polyhedrons_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int c=0;
		
		while(n-->0)
		{
			String str=obj.next();
			switch(str)
			{
				case "Tetrahedron":
					c+=4;
					break;
					
				case "Cube":
					c+=6;
					break;
					
				case "Octahedron":
					c+=8;
					break;
					
				case "Dodecahedron":
					c+=12;
					break;
					
				case "Icosahedron":
					c+=20;
					break;
				
			}
		
		}
		
		System.out.println(c);
	}

}
