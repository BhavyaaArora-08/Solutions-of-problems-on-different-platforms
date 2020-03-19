import java.util.Arrays;

public class _628_Maximum_Product_of_Three_Numbers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 722,634,-504,-379,163,-613,-842,-578,750,951,-158,30,-238,-392,-487,-797,-157,-374,999,-5,-521,-879,-858,382,626,803,-347,903,-205,57,-342,186,-736,17,83,726,-960,343,-984,937,-758,-122,577,-595,-544,-559,903,-183,192,825,368,-674,57,-959,884,29,-681,-339,582,969,-95,-455,-275,205,-548,79,258,35,233,203,20,-936,878,-868,-458,-882,867,-664,-892,-687,322,844,-745,447,-909,-586,69,-88,88,445,-553,-666,130,-640,-918,-7,-420,-368,250,-786};
		System.out.println(one(arr));
	}

	//TC: O(nlogn)
	public static int one(int[] arr)
	{
		
		Arrays.sort(arr);
		int temp1=arr[0]*arr[1];
		int temp2=arr[arr.length-1]*arr[arr.length-2];
		int temp3=arr[0]*arr[arr.length-1];
		
		
		if(Math.abs(temp3)>temp2 && Math.abs(temp3)>temp1 && arr[1]<0)
		{
			return arr[1]*temp3;
		}
		else if(temp2>temp1)
		{
			System.out.println();
			if(temp2<0) 
			{
				if(arr[0]<0)
					return temp2*arr[0];
				else
					return temp2*arr[arr.length-3];
			}
			else
			{
				return temp2*arr[arr.length-3];
			}
		}
		else
		{
			if(temp1<0)
			{
				return temp1*arr[2];
			}
			else
			{
				return arr[arr.length-1]*temp1;
			}
		}
				
	}
	
	public static int maximumProduct(int[] nums) {

		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE,
				min2 = Integer.MAX_VALUE;
		for (int n : nums) {
			if (n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (n > max2) {
				max3 = max2;
				max2 = n;
			} else if (n > max3) {
				max3 = n;
			}

			if (n < min1) {
				min2 = min1;
				min1 = n;
			} else if (n < min2) {
				min2 = n;
			}
		}
		return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
