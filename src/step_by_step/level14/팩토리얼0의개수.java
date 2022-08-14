package step_by_step.level14;

import java.util.Scanner;

public class 팩토리얼0의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count_2 = 0;
        int count_5 = 0;

        while (n > 0) {
            int temp = n;
            for (; (temp % 2) == 0; temp /= 2) {
                count_2++;
            }
            temp = n;
            for (; (temp % 5) == 0; temp /= 5) {
                count_5++;
            }
            n--;
        }

        System.out.println(Math.min(count_2, count_5));
    }
}
