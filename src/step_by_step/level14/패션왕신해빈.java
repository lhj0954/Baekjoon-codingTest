package step_by_step.level14;

import java.io.*;
import java.util.*;

public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            Map<String, Integer> count = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String str = br.readLine();
                String[] strArr = str.split(" ");

                if (count.containsKey(strArr[1])) {
                    count.put(strArr[1], count.get(strArr[1]) + 1);
                } else {
                    count.put(strArr[1], 1);
                }
            }
            Integer[] arr = count.values().toArray(new Integer[0]);
            int result = 1;
            for (int k = 0; k < arr.length; k++) {
                result *= (arr[k] + 1);
            }

            bw.write((result - 1) + "\n");
        }
        bw.close();
    }
}
