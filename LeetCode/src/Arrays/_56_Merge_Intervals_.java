import java.util.Arrays;
import java.util.Comparator;

public class _56_Merge_Intervals_ {
	public static void main(String[] args) {
			
		int[][] arr=new int[4][2];
		Comparator<int[]> comp=new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
		};
		Arrays.sort(arr, comp);
	}
}
