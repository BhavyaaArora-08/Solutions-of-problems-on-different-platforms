import java.util.*;
public class temp2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-- > 0) {
            int nc = obj.nextInt();
            int[] C = new int[nc];
            int[] L = new int[nc];
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < nc; i++) {
                C[i] = obj.nextInt();
            }
            for(int i = 0; i < nc; i++) {
                L[i] = obj.nextInt();
            }
            int ans = 0;
            for(int i=0;i<nc;i++) {
                min = Math.min(min, C[i]);
                ans+= (min*L[i]);
            }
            System.out.println(ans);
        }
    }
}