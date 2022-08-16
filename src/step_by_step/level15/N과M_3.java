package step_by_step.level15;

import java.io.*;

public class N과M_3 {
    static String[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void asdf(int n, int m, int depth) throws IOException {
        if (depth == m) {
             bw.write(String.join(" ", arr) + "\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = String.valueOf(i + 1);
            asdf(n, m, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split(" ");

        int n = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        arr = new String[m];

        asdf(n, m, 0);
        bw.close();
    }
}
