package step_by_step.level16;

import java.io.*;

public class 신나는함수실행 {
    static int[][][] memo = new int[51][51][51];

    static int function (int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            memo[x][y][z] = 1;
            return memo[x][y][z];
        } else if (x > 20 || y > 20 || z > 20) {
            memo[x][y][z] = function(20, 20, 20);
            return memo[x][y][z];
        } else {
            if (x < y && y < z) {
                if (memo[x][y][z - 1] == 0) {
                    function(x, y, z - 1);
                }
                if (memo[x][y - 1][z - 1] == 0) {
                    function(x, y - 1, z - 1);
                }
                if (memo[x][y - 1][z] == 0) {
                    function(x, y - 1, z);
                }
                memo[x][y][z] = memo[x][y][z - 1] + memo[x][y - 1][z - 1] - memo[x][y - 1][z];
            } else {
                if (memo[x - 1][y][z] == 0) {
                    function(x - 1, y, z);
                }
                if (memo[x - 1][y - 1][z] == 0) {
                    function(x - 1, y - 1, z);
                }
                if (memo[x - 1][y][z - 1] == 0) {
                    function(x - 1, y, z - 1);
                }
                if (memo[x - 1][y - 1][z - 1] == 0) {
                    function(x - 1, y - 1, z - 1);
                }
                memo[x][y][z] = memo[x - 1][y][z] + memo[x - 1][y - 1][z] + memo[x - 1][y][z - 1] - memo[x - 1][y - 1][z - 1];
            }
        }
        return memo[x][y][z];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while (!(input = br.readLine()).equals("-1 -1 -1")) {
            int[] arr = new int[3];
            int[] arr2 = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(input.split(" ")[i]);
                arr2[i] = Integer.parseInt(input.split(" ")[i]);
                if (arr[i] < 0) {
                    arr[i] = 0;
                }
            }

            bw.write("w(" + arr2[0] + ", " + arr2[1] + ", " +  arr2[2] + ") = " + function(arr[0], arr[1], arr[2]) + "\n");
        }
        bw.close();
    }
}
