package step_by_step.level14;

import java.util.*;

public class 이항계수1 {
    static int factorial (int n) {
        if ()
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m == 0) {
            System.out.println(1);
        } else if (n == m) {
            System.out.println(1);
        } else {
            System.out.println(n * (n - 1) / m);
        }
    }
}
