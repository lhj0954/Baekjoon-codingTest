package step_by_step.level12;

import java.util.*;

public class 숫자카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        Map<Integer, Integer> map =  new LinkedHashMap<>();
        for(int i = 0; i < m; i++) {
            map.put(i, sc.nextInt());
        }

        for (int j = 0; j < arr.length; j++) {
            if (map.containsValue(arr[j])) {
                map.put(j, map.get(j) + 1);
            }
        }

    }
}

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        Map<Integer, Integer> map =  new LinkedHashMap<>();
        for(int i = 0; i < m; i++) {
            map.put(sc.nextInt(), 0);
        }

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            }
        }

        map.forEach((key, value) -> System.out.print(value + " "));
    }
*/
