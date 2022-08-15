package step_by_step.level15;

import java.util.Scanner;

public class N과M_1 {
    static int[] arr;
    static boolean[] visited;

    static void asdf (int n, int m, int depth) {
        if (depth == m) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                asdf(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        visited = new boolean[n];

        asdf(n, m, 0);
    }
}
