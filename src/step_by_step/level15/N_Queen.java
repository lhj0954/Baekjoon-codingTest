package step_by_step.level15;

import java.util.*;

public class N_Queen {
    static int[] arr;
    static int count = 0;

    static boolean check (int row) {
        for (int j = 0; j < row; j++) {
            if ((arr[j]) == arr[row] || ( row - j == Math.abs(arr[row] - arr[j]))) {
                return false;
            }
        }
        return true;
    }

    static void nQueen(int n, int row) {
        if (row == n) {
            count++;
            return;
        }

        for (int column = 0; column < n; column++) {
            arr[row] = column; // 퀸의 위치 : (row, column)
            if (check(row)) {
                nQueen(n, row + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];

        nQueen(n, 0);

        System.out.println(count);
    }
}
