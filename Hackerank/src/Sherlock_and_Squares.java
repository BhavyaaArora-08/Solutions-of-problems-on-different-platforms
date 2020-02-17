
public class Sherlock_and_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0;
		int x=17;
		int y=24;
		
		int x1=(int) Math.ceil(Math.sqrt(x));
		int y1=(int) Math.floor(Math.sqrt(y));
		
		c=y1-x1+1;
		
		System.out.println(c);
		
		
	}

}
