package step_by_step.level14;

import java.util.*;

public class 이항계수1 {
    static int factorial (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(factorial(n)/(factorial(m)*factorial(n-m)));
    }
}
