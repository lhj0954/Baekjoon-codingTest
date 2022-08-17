package step_by_step.level3;

import java.util.Scanner;

public class AaddB_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=0; i<a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(b+c);
        }
    }
}
