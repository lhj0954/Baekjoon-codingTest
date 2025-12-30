package step_by_step.level1;

import java.io.*;
import java.util.*;

public class 꼬마정민 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        long sum = 0;
        while (st.hasMoreTokens())
            sum += Long.parseLong(st.nextToken());

        System.out.println(sum);
    }
}