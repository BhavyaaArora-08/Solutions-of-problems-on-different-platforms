import java.util.HashMap;

public class _1217_Playing_With_Chips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		System.out.println(min(arr));
	}
	
	
	public int minCostToMoveChips(int[] chips) {
        int[] count = new int[2];
        for (int i = 0; i < chips.length; i++)
            count[chips[i] % 2] += 1;
        return Math.min(count[1], count[0]);
    }
	
	
	public static int min(int[] arr)
	{
		
		int min=Integer.MAX_VALUE;
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		for(int i=0;i<arr.length;i++)
		{
			int didx=arr[i];
			int mina=0;
			if(map.containsKey(didx))
				continue;
			
			for(int j=0;j<arr.length;j++)
			{
				int sidx=arr[j];
				
				int temp=Math.abs(sidx-didx);
				
				if(temp%2==1)
					mina+=1;
				else if(temp%2==0)
					mina+=0;	
			}
			
			map.put(didx, true);
			
			min=Math.min(mina, min);
		}
		
		return min;
	}

}
