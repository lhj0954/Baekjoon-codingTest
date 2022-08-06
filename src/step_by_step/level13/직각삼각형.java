package step_by_step.level13;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] str = input.split(" ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(str[0]);
            arr[1] = Integer.parseInt(str[1]);
            arr[2] = Integer.parseInt(str[2]);

            Arrays.sort(arr);

            if ((arr[2] * arr[2]) == ((arr[0] * arr[0]) + (arr[1] * arr[1]))) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.close();
    }
}
