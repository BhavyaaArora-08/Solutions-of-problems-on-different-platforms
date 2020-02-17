package Arrays;


public class _1013_Partiotion_Array_Into_Three_Parts_With_Equal_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3,3,6,5,-2,2,5,1,-9,4};
		System.out.println(fina(arr));
	}

	public static boolean fina(int[] arr) {
		int sum = 0;
		boolean bool=false;;
		
		for (int val : arr)
			sum += val;

		sum = sum / 3;

		int i = 0, j = 0, k = 0;
		int temp = 0;

		while (i < arr.length - 2) {
			temp += arr[i];
			i++;

			if (temp == sum)
			{
				bool=true;
				break;
			}

		}

		j = i;
		temp = 0;
		bool=false;
		
		while (j < arr.length - 1) {
			temp += arr[j];
			j++;

			if (temp == sum)
			{
				bool=true;
				break;
			}
		}

		k = j;
		temp = 0;
		bool=false;

		while (k < arr.length) {
			temp += arr[k];
			k++;

			if (temp == sum)
			{
				bool=true;
				break;
			}
		}

		return bool;

	}

	public static boolean find(int[] arr) {
		int j = 0, k = 0;
		int sum = 0;

		for (int i = 0; i < arr.length - 2; i++) {
			j = i + 1;
			sum += arr[i];
			int temp = arr[j];

			while (j < arr.length - 1 && temp < sum) {
				j++;
				temp += arr[j];
			}

			if (temp != sum)
				continue;

			k = j + 1;
			temp = arr[k];

			while (k < arr.length - 1 && temp < sum) {
				k++;
				temp += arr[k];
			}

			if (temp == sum && k == arr.length - 1)
				return true;

		}

		return false;

	}

}
