package step_by_step.level1;

import java.util.*;

public class 킹퀸룩비숍나이트폰 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - sc.nextInt();
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
