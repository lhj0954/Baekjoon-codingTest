package step_by_step.level12;

import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<String> unheard = new HashSet<>();
        HashSet<String> notSeen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unheard.add(sc.next());
        }
        for (int i = 0; i < m; i++) {
            notSeen.add(sc.next());
        }

        unheard.retainAll(notSeen);

        System.out.println(unheard.size());
        unheard.stream().sorted().forEach(System.out::println);
    }
}

