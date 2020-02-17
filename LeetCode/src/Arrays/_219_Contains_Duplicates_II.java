import java.util.HashMap;

public class _219_Contains_Duplicates_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,0,1,1};
		int k=2;
		
		System.out.println(find(arr, k));
	}
	
//	if(nums == null || nums.length == 0){
//        return false;
//    }
//    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//    for(int i = 0; i < nums.length; i++){
//        if(map.containsKey(nums[i])){
//            if(i - map.get(nums[i]) <= k){
//                return true;
//            }
//        }
//        map.put(nums[i], i);
//    }
//    return false;
    
	public static boolean find(int[] arr,int k)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
			map.put(i, arr[i]);
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsValue(arr[i]))
			{
				for(int key:map.keySet())
				{
					if(key!=i && arr[key]==arr[i] && Math.abs(key-i)==k)
						return true;
				}
			}
		}
		
		return false;
		
	}
}
