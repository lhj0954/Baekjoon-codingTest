package step_by_step.level1;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //첫번째 3자리 수
        int b = sc.nextInt(); //두번째 3자리 수

        System.out.println(a*(b%10));
        System.out.println(a*((b/10)%10));
        System.out.println(a*((b/100)));
        System.out.println(a*b);
    }
}
