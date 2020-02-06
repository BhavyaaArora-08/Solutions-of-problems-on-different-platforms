import java.math.BigInteger;

public class _66_Plus_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,6,5,4,3,2,1,0};
		find(arr);
		
	}
	
	public static int[] find(int[] arr)
	{
		String str="";
		for(int val:arr)
			str+=val;
		
		BigInteger h=new BigInteger(str+"");
		h=h.add(BigInteger.ONE);
		
		str=h.toString();
		
		char[] ans=str.toCharArray();
		int[] heyy=new int[ans.length];
		
		for(int i=0;i<ans.length;i++)
			heyy[i]=Integer.valueOf(ans[i]+"");
		
		for(int val:heyy)
			System.out.println(val);
		
		
		return heyy;
	}

}
