package step_by_step.level12;

import java.util.*;

public class 숫자카드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (set1.contains(arr[i])) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
