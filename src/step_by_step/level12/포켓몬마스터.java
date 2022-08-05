package step_by_step.level12;

import java.util.*;
import java.io.*;

public class 포켓몬마스터 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr2 = br.readLine().split(" ");
        int n = Integer.parseInt(arr2[0]);
        int m = Integer.parseInt(arr2[1]);;
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 =  new HashMap();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map1.put(String.valueOf(i), name);
            map2.put(name, String.valueOf(i));
        }

        for (int i = 0; i < m; i++) {
            String temp =  br.readLine();
            if (map1.containsKey(temp)) {
                bw.write(map1.get(temp) + "\n");
            } else {
                bw.write((map2.get(temp) + "\n"));
            }
        }

        bw.close();
    }
}
