package _20th_March_2020;

import java.util.Arrays;

public class _746_Min_Cost_Climbing_Stairs_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(find(arr));
		
//		int[] strg=new int[arr.length];
//		Arrays.fill(strg, -1);
//		System.out.println(one(0, arr, 0,strg,""));
	}
	
	
	public static int find(int[] arr)
	{
		int[] ans=new int[arr.length+1];
		ans[0]=0;
		ans[1]=0;
		
		for(int i=2;i<arr.length+1;i++)
		{
			int x=ans[i-1]+arr[i-1];
			int y=ans[i-2]+arr[i-2];
			ans[i]=Math.min(x, y);
		}
		
		
		return ans[ans.length-1];
		
	}
	
	//strg ne kaam kharaab kar diya
	public static int one(int vidx,int[] arr,int c,int[] strg,String str)
	{
				
		if(vidx==arr.length)
		{
//			System.out.println(str);
			return c;
		}
		
		if(vidx>arr.length)
			return Integer.MAX_VALUE;
		
		if(strg[vidx]!=-1)
			return strg[vidx];
		
		if(vidx!=0)
		{
			int x=one(vidx+1, arr, c+arr[vidx],strg,str+arr[vidx]+" ");
			int y=one(vidx+2, arr, c+arr[vidx],strg,str+arr[vidx]+" ");
			strg[vidx]=Math.min(x, y);
			System.out.println(Arrays.toString(strg));
			return Math.min(x, y);
		}
		else
		{
			int x=one(vidx+1, arr, c+arr[vidx],strg,str+arr[vidx]+" ");
			int y=one(vidx+2, arr, c+arr[vidx],strg,str+arr[vidx]+" ");
			int z=one(1, arr, c,strg,str);
			strg[vidx]=Math.min(Math.min(x, y), z);
			System.out.println(Arrays.toString(strg));
			return Math.min(Math.min(x, y), z);
		}
	}

}
