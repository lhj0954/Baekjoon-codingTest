package step_by_step.level14;

import java.util.*;
import java.io.*;

public class 다리놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int p = Integer.parseInt(strArr[1]);
            int q = Integer.parseInt(strArr[0]);

            int[][] pascal = new int[p + 1][];
            for (int j = 0; j < pascal.length; j++) {
                pascal[j] = new int[j + 1];
            }
            for (int j = 0; j < pascal.length; j++) {
                pascal[j][0] = 1;
                pascal[j][pascal[j].length - 1] = 1;
            }

            for (int j = 2; j < pascal.length; j++) {
                for (int k = 1; k < (pascal[j].length - 1); k++) {
                    pascal[j][k] = (pascal[j - 1][k - 1] + pascal[j - 1][k]);
                }
            }

            bw.write(pascal[p][q] + "\n");
        }
        bw.close();
    }
}
