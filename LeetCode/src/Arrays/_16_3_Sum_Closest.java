import java.util.Arrays;

public class _16_3_Sum_Closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,2};
		int target=3;
		
//		System.out.println(ans(nums, target));
		System.out.println(best(nums, target));
	}
	
	//Time Complexity: O(n^2)
	public static int best(int[] nums,int target)
	{
		Arrays.sort(nums);
		int n=nums.length;
		int min=Integer.MAX_VALUE;
		int sum=0;
		
		for(int i=0;i<n-2;i++)
		{
			int l=i+1,r=n-1;
			
			while(l<r)
			{
				int temp=nums[i]+nums[l]+nums[r];
				if(temp==target)
					return target;
				if(temp>target)
				{
					r--;
				}
				else
				{
					l++;
				}
				
				if(Math.abs(temp-target)<min)
				{
					//System.out.println(temp);
					sum=temp;
					min=Math.abs(temp-target);
				}
			}
			
		}
		
		return sum;
	}
	
	
	//Time Complexity: O(n^3) 
	public static int ans(int[] nums,int target)
	{
		int ans=0,clos=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int sum=nums[i]+nums[j]+nums[k];
                    int t=Math.abs(target-sum);
                    if(t<clos)
                    {
                    	clos=t;
                    	ans=sum;
                    }
                }
            }
        }
		
		return ans;
	}

}
