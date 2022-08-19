package step_by_step.level16;

import java.util.ArrayList;
import java.util.Scanner;

public class 알고리즘수업_피보나치수1 {
    static int count_f = 0;
    static int count_d = 0;

    static int recursion(int n) {
        if (n == 1 || n == 2) {
            count_f++;
            return 1;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }

    static void dynamic_programming(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 1);
        arr.add(1, 1);

        for (int i = 2; i < n; i++) {
            count_d++;
            arr.add(i, arr.get(i - 1) + arr.get(i - 2));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        recursion(n);
        dynamic_programming(n);

        System.out.println(count_f + " " + count_d);
    }
}
