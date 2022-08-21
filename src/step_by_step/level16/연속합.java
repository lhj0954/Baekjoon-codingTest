package step_by_step.level16;

import java.io.*;
import java.util.StringTokenizer;

public class 연속합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        StringTokenizer inputs = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputs.nextToken());
        }
        int max;

        arr2[0] = max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int tempt = arr[i] + arr2[i - 1];
            if (arr[i] < tempt) {
                arr2[i] = tempt;
            }
            if (arr[i] > tempt) {
                arr2[i] = arr[i];
            }
            max = Math.max(max, arr2[i]);
        }

        bw.write(""+max);
        bw.close();
    }
}
