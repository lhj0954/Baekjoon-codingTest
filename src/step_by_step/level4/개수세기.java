package level4;

import java.io.*;
import java.util.StringTokenizer;

public class 개수세기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int idx = 0;

        // N개 숫자를 다 읽을 때까지 줄을 계속 읽음 (한 줄이든 여러 줄이든 OK)
        while (idx < n) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens() && idx < n) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        int v = Integer.parseInt(br.readLine());

        int result = 0;
        for (int x : arr) {
            if (x == v)
                result++;
        }

        System.out.println(result);
    }
}
