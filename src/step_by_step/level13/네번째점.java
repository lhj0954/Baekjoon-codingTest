package step_by_step.level13;

import java.util.*;

public class 네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        int n = x[0] + x[2] - x[1];
        int m = y[0] + y[2] - y[1];

        System.out.println(n+" "+m);
    }
}
