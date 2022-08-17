package step_by_step.level2;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if ( m-45 < 0 && h == 0) {
            System.out.print(23+" "+(m+15));
        } else if (m-45 < 0) {
            System.out.print((h-1)+" "+(m+15));
        } else {
            System.out.print(h+" "+(m-45));
        }
    }
}
