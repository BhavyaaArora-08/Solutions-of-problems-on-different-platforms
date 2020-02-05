import java.util.Arrays;

public class _1170_Compare_Frequency_of_the_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] queries = {"bbb","cc"}, words = {"a","aa","aaa","aaaa"};
		int[] ans=hey(queries, words);
		
		for(int val:ans)
			System.out.print(val+" ");
		
		System.out.println();
	}
	
	
	public static int[] hey(String[] quer,String[] words)
	{
		int[] ans=new int[quer.length];
		
		int[] q=fs(quer);
		int[] w=fs(words);
		
		for(int i=0;i<q.length;i++)
		{
			int temp=q[i];
			
			for(int j=0;j<w.length;j++)
			{
				if(w[j]>temp)
					ans[i]++;
			}
		}
		
		return ans;
		
	}
	
	
	public static int[] fs(String[] arr)
	{
		
		int[] ans=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			char[] ch=arr[i].toCharArray();
			Arrays.sort(ch);
			
			int j=0;
			char c=ch[0];
			
			while(j<ch.length && ch[j]==c)
				j++;
			
			ans[i]=j;
		}
		
		
//		for(int val:ans)
//			System.out.print(val+" ");
//		
//		System.out.println();
		
		return ans;
		
	}

}
