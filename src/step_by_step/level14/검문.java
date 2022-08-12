package step_by_step.level14;

import java.util.*;

public class 검문 {
    static int Euclid(int s, int l) {
        if (l%s == 0) {
            return s;
        } else {
            return Euclid(l%s, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        HashSet<Integer> set = new LinkedHashSet<>();

        for (int j = 0; j < arr[0]; j++) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < temp.length; i++) {
                temp[i] = temp[i] - j;
            }
            boolean find = true;
            for (int k = 0; k < (arr.length-1); k++) {
                if (Euclid(arr[k], arr[k+1]) == 1) {
                    find = false;
                    break;
                }
            }
            if (find) {
                set.add(j);
            }
        }

//        for (int j = 2; j <= arr[1]; j++) { //여기서 시간을 줄여야함
//            boolean find = true;
//            for (int k = 0; k < (arr.length - 1); k++) {
//                if (arr[k]%j != arr[k+1]%j) {
//                    find = false;
//                    break;
//                }
//            }
//            if (find) {
//                set.add(j);
//            }
//        }
//        다른 방법-> 나머지를 빼고 최대 공약수의 1을 제외한 약수들

        set.forEach((m)-> System.out.print(m + " "));
    }
}
