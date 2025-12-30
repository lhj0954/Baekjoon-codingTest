package level4;

import java.io.*;
import java.util.*;

public class 공넣기 {
    // public static void main(String[] args) throws Exception {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine());

    // int[] bucket = new int[Integer.parseInt(st.nextToken())];
    // int idx = 0;

    // while (idx < Integer.parseInt(st.nextToken())) {
    // StringTokenizer st2 = new StringTokenizer(br.readLine());
    // int start = Integer.parseInt(st2.nextToken()) - 1;
    // int end = Integer.parseInt(st2.nextToken()) - 1;
    // int v = Integer.parseInt(st2.nextToken());
    // for (int i = start; i < end; i++) {
    // bucket[i] = v;
    // }
    // }

    // for (int i : bucket) {
    // System.out.println(i + " ");
    // }
    // }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bucket = new int[n];

        for (int idx = 0; idx < m; idx++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken());

            for (int i = start; i <= end; i++) { // 보통 end 포함
                bucket[i] = v;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(bucket[i]).append(' ');
        }
        System.out.print(sb.toString());
    }
}
