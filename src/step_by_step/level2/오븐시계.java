package step_by_step.level2;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int h = (b+c)/60;
        int m = (b+c)%60;

        System.out.print((a+h)%24+" "+m);
    }
}
