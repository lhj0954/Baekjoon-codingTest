package step_by_step.level2;

import java.util.Scanner;

public class 사분면고르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.print("1");
        } else if (x > 0 && y < 0) {
            System.out.print("4");
        } else if (x < 0 && y > 0) {
            System.out.print("2");
        } else {
            System.out.print("3");
        }
    }
}
