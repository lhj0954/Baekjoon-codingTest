package step_by_step.level14;

import java.util.*;

public class 링 {
    static int Euclid(int a, int b) {
        int l = a;
        int s = b;

        if (b > a) {
            l = b;
            s = a;
        }

        if (l % s == 0) {
            return s;
        } else {
            return Euclid(l % s, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] arr2 = new String[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 0;
        for (int j = 1; j < arr.length; j++) {
            int gcd = Euclid(arr[0], arr[j]);
            arr2[k] = arr[0]/gcd + "/" + arr[j]/gcd;
            k++;
        }

        for (String s : arr2) {
            System.out.println(s);
        }
    }
}
