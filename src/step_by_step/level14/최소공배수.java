package step_by_step.level14;

import java.util.*;

public class 최소공배수 {
    static int Euclid(int s, int l) {
        if (l%s == 0) {
            return s;
        } else {
            return Euclid(l%s, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int l = sc.nextInt();

            if (s > l) {
                int temp = s;
                s = l;
                l = temp;
            }

            int e = Euclid(s, l);
            arr[i] = s*l/e;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
