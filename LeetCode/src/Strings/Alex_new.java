package Strings;
import java.util.Scanner;
public class Alex_new {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int q = scn.nextInt();
        int[] A = new int[q];
        int[] k = new int[q];
        for (int p = 0; p < q; p++) {
            A[p] = scn.nextInt();
            k[p] = scn.nextInt();
        
            int c = count(arr, A[p]);
            if (c >= k[p])
                System.out.println("Yes");
            else {
                System.out.println("No");
            }
        }
    }
    static public int count(int[] arr, int A) {
        int co = 0;
        for (int i = 0; i < arr.length; i++) {
            int b = arr[i];
            int flag = 1;
            while (flag != 0) {
                if (arr[i] > A)
                    flag = 0;
                else if (arr[i] < A) {
                    arr[i] += arr[i];
                }
                if (arr[i] == A) {
                    co = co + 1;
                    flag = 0;
                }
            }
            arr[i] = b;
        }
        return co;
    }
}
