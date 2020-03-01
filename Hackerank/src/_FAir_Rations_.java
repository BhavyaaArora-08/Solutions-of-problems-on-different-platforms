import java.util.HashMap;
import java.util.Scanner;

public class _FAir_Rations_ {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();

        find(arr);
    }

    public static void find(int[] arr) {
        int ans = 0;
        if (arr[0] % 2 != 0) {
            arr[0]++;
            arr[1]++;
            ans = 2;
        }

//        System.out.println(ans + " " + arr[0] + " " + arr[1]);

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
                arr[i + 1]++;
                ans += 2;
//                System.out.println(arr[i] + " " + arr[i + 1]);
            }
        }

        if (arr[arr.length - 1] % 2 != 0)
            System.out.println("NO");
        else
            System.out.println(ans);


    }

}
