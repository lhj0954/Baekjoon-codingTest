package step_by_step.level14;

import java.util.*;
import java.io.*;

public class 배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while (!(input = br.readLine()).equals("0 0")) {
            String[] number = input.split(" ");
            if ((Integer.parseInt(number[0])%Integer.parseInt(number[1])) == 0) {
                bw.write("multiple\n");
            } else if ((Integer.parseInt(number[1])%Integer.parseInt(number[0])) == 0){
                bw.write("factor\n");
            } else {
                bw.write("neither\n");
            }
        }
        bw.close();
    }
}
