import java.util.Scanner;

public class InverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		int num=obj.nextInt();
		
		int place = 1;
        int mult = 1;
        int ans = 0;

        while(num != 0){
            int rem = num % 10;
            ans = ans + place * (int)Math.pow(10, rem - 1);
            num = num / 10;
            place++;
        }
		
		System.out.println(ans);
	}

}
