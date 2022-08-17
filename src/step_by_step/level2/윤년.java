package step_by_step.level2;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ( (a%4 == 0 && a%100 != 0) || a%400 == 0) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
