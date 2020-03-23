package _20th_March_2020;

import java.util.HashMap;

public class _1346_Check_If_N_and_Its_Double_Exist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-2,0,10,-19,4,6,-8};
		System.out.println(one(arr));
	}
	
	
	public static boolean one(int[] arr)
	{
		
		if(arr.length==2 && arr[0]==arr[1] && arr[0]==0)
            return true;
		
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		for(int val:arr)
			map.put(val,true);
		
		for(int val:arr)
			if(map.containsKey(val*2) && val!=0)
				return true;
		
		return false;
	}

}
