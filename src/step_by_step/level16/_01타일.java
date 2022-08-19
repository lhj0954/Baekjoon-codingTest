package step_by_step.level16;

import java.util.*;

//이항계수를 써야 할 것 같은 기분
public class _01타일 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 1);
        arr.add(1, 2);

        for (int i = 2; i < n; i++) {
            arr.add(i, (arr.get(i - 2) + arr.get(i - 1))%15746);
        }

        System.out.println(arr.get(n - 1));
    }
}
