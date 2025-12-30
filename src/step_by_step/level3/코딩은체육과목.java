package step_by_step.level3;

import java.util.Scanner;

public class 코딩은체육과목 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = n / 4;

        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= c; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);

        sc.close();
    }
}
