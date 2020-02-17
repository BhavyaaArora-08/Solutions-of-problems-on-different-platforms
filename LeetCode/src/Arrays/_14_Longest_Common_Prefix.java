import java.util.Scanner;

public class _14_Longest_Common_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		String[] arr=new String[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.next();
		}
		
//		System.out.println("hey".substring(0,2));
//		System.out.println(check(arr));
		System.out.println(longestCommonPrefix(arr));
		
	}

	public static String check(String[] arr) {
		// TODO Auto-generated method stub
		
		if(arr.length==0)
			return "";
		
		String com=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			int j=0;
			while(j<Math.min(com.length(), arr[i].length()) && arr[i].charAt(j)==com.charAt(j))
			{
				j++;
			}
			
			com=com.substring(0,j);
		}
		
		return com;
	}
	
	 public static String longestCommonPrefix(String[] strs) {
		    if(strs == null || strs.length == 0)    return "";
		    String pre = strs[0];
		    int i = 1;
		    while(i < strs.length){
		        while(strs[i].indexOf(pre) != 0)
		        {
//		        	System.out.println(strs[i].indexOf(pre) +" "+ pre);
		            pre = pre.substring(0,pre.length()-1);
//		            System.out.println(pre);
		        }
		        i++;
		    }
		    return pre;
	 }

}
