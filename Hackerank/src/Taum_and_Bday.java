
public class Taum_and_Bday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static long find(int b,int bc,int w,int wc,int z)
	{
		long ans=0l;
		
		long t1=((long)b*bc)+((long)w*wc);
		long t2=(((long)b*z)+(((long)w+b)*(long)wc));
		long t3=((long)w*z)+(((long)w+b)*bc);	
		ans = Math.min(t1,(long)Math.min(t2,t3));
		
		return ans;
		
	}

}
