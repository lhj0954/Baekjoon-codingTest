package step_by_step.level2;

import java.util.Scanner;

public class 시험성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 90) {
            System.out.print("A");
        } else if (a >= 80) {
            System.out.print("B");
        } else if (a >= 70) {
            System.out.print("C");
        } else if (a >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
