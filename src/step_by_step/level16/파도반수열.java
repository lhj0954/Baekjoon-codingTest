package step_by_step.level16;

import java.util.*;

public class 파도반수열 {
    static ArrayList<Long> arr = new ArrayList<>();

    static Long progression (int input) {
        for (int i = 5; i < input; i++) {
            arr.add(i, arr.get(i - 5) + arr.get(i - 1));
        }
        return arr.get(input - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Long[] sysArr = new Long[n];
        arr.add(0, 1L);
        arr.add(1, 1L);
        arr.add(2, 1L);
        arr.add(3, 2L);
        arr.add(4, 2L);

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            sysArr[i] = progression(input);
        }

        for (Long j : sysArr) {
            System.out.println(j);
        }
    }
}
