package step_by_step;

import java.util.*;

public class 문자열집합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        int m = sc.nextInt();
        String[] arr = new String[m];

        for(int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        int count = 0;
        for (String s : arr) {
            if (set.contains(s)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
