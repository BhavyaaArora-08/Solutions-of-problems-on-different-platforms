package Arrays;

import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);

		int num = obj.nextInt();
		int rot = obj.nextInt();
		
		int nod=0;
		int temp=num;
		
		while(temp!=0)
		{
			nod++;
			temp=temp/10;
		}
		
		if(rot<0)
			rot+=nod;
		
		for(int i=0;i<rot;i++)
		{
			int newNum =  (((num%10) * (int) Math.pow(10, nod-1)) + (num/10));
			num=newNum;
		}
		
		System.out.println(num);
		
	}

}
