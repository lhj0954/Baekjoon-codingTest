package step_by_step.level14;

import java.util.Scanner;

public class 조합0의개수 {
    static int count_0(int n) {
        int count_2 = 0;
        int count_5 = 0;
        while (n > 0) {
            for (int i = 2; (n % i) == 0; i *= 2) {
                count_2++;
            }
            for (int i = 5; (n % i) == 0; i *= 5) {
                count_5++;
            }
            n--;
        }
        return Math.min(count_2, count_5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m > (n/2)) {
            m = n - m;
        }

        int count_n_0 = count_0(n);
        int count_m_0 = count_0(m);
        int count_gap_0 = count_0(n - m);

        System.out.println(count_n_0 - count_m_0 - count_gap_0);
    }
}
