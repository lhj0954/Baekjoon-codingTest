package step_by_step.level15;

import java.io.*;

public class N과M_4 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String[] arr;

    static void backTracking(int n, int k, int depth) throws IOException {
        if (depth == arr.length) {
            bw.write(String.join(" ", arr) + "\n");
            return;
        }

        for (int i = k; i <= n; i++) {
            arr[depth] = String.valueOf(i);
            backTracking(n, i, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputs = br.readLine();
        String[] input = inputs.split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        arr = new String[m];

        backTracking(n, 1, 0);

        bw.close();
    }
}
