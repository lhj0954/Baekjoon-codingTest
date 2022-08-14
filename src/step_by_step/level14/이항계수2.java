package step_by_step.level14;

import java.util.*;

public class 이항계수2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] pascal = new int[n + 1][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
        }
        for (int i = 0; i < pascal.length; i++) {
            pascal[i][0] = 1;
            pascal[i][pascal[i].length - 1] = 1;
        }

        for (int i = 2; i < pascal.length; i++) {
            for (int j = 1; j < (pascal[i].length - 1); j++) {
                pascal[i][j] = (pascal[i - 1][j - 1] + pascal[i - 1][j])%10007;
            }
        }

        System.out.println(pascal[n][m]);
    }
}
