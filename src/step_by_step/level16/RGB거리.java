package step_by_step.level16;

import java.io.*;
import java.util.StringTokenizer;

public class RGB거리 {
    static int[][] setting;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        setting = new int[N][3];
        dp = new int[N];
        for (int i = 0;  i < N; i++) {
            StringTokenizer pay = new StringTokenizer(br.readLine());
            setting[i][0] = Integer.parseInt(pay.nextToken());
            setting[i][1] = Integer.parseInt(pay.nextToken());
            setting[i][2] = Integer.parseInt(pay.nextToken());
        }
    }

    static int find_min () {
        dp[0] = setting[0][0];


    }
}
