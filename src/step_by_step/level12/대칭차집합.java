package step_by_step.level12;

import java.util.*;

public class 대칭차집합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> a_0 = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            a.add(k);
            a_0.add(k);
        }
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        a_0.retainAll(b);
        a.removeAll(a_0);
        b.removeAll(a_0);
        a.addAll(b);

        System.out.println(a.size());
    }
}
