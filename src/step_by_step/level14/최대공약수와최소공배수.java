package step_by_step.level14;

import java.util.*;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int s = n;
        int l = m;
        if (n > m) {
            s = m;
            l = n;
        }

        int gcd = 1;
        int lcm = 0;
        for (int i = 1; i <= s; i++) {
            if ((s%i == 0) && (l%i == 0)) {
                gcd = i;
                lcm = (s/i)*(l/i)*gcd;
            }
        }

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
