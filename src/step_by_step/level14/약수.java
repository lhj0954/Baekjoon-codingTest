package step_by_step.level14;

import java.util.*;

public class 약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n%2 == 1) {
            System.out.println((int)Math.pow(arr[arr.length/2], 2));
        } else {
            System.out.println(arr[arr.length/2-1]*arr[arr.length/2]);
        }
    }
}
