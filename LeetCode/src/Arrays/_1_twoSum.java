package Arrays;

import java.util.HashMap;

public class _1_twoSum{
	public int[] twoSum(int[] nums, int target){
		   HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		        for(int i = 0; i < nums.length; i++){

		            Integer diff = (Integer)(target - nums[i]);
		            if(hash.containsKey(diff)){
		                int toReturn[] = {hash.get(diff), i};
		                return toReturn;
		            }

		            hash.put(nums[i], i);

		        }
		        
		        return null;
		}
}
