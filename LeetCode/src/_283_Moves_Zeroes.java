import java.util.Arrays;

public class _283_Moves_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0,1, 0, 0, 1, 0, 3, 0, 2 };
		faster(arr);
	}
	
	
	public static void faster(int[] arr)
	{
		boolean[] hey=new boolean[arr.length];
		Arrays.fill(hey, false);
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				hey[i]=true;
				count++;
			}
		}
		
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(hey[i])
				arr[c++]=arr[i];
			
			if(c==count)
				break;
		}
		
		
		for(int i=count;i<arr.length;i++)
			arr[i]=0;
		
		
		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();
		
	}

	public static void shift(int[] arr) {
		if (arr.length < 2)
			return;

		int i = 0, j = 1;

		while (i < arr.length) {

			while (i < arr.length && arr[i] != 0)
				i++;

			j = i + 1;
			while (j < arr.length && arr[j] == 0)
				j++;

			if (i != arr.length && j != arr.length) {
				arr[i] = arr[j];
				arr[j] = 0;
			}
			i++;

		}

		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();
	}

}
