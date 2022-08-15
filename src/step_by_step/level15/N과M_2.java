package step_by_step.level15;

import java.util.*;

public class N과M_2 {
    static int[] arr;

    static void asdf(int n, int depth, int m) {
        if (depth == arr.length) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = m; i <= n; i++) {
            arr[depth] = i;
            asdf(n,depth + 1, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];

        asdf(n, 0, 1);
    }
}
