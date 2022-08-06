package step_by_step.level13;

import java.util.*;

public class 참외밭 {
    static void move (String str, int[][] point, int i) {
        String[] order =  str.split(" ");
        switch (order[0]) {
            case "1":
                point[i][0] = point[i-1][0] + Integer.parseInt(order[1]);
                break;
            case "2":
                point[i][0] = point[i-1][0] - Integer.parseInt(order[1]);
                break;
            case "3":
                point[i][1] = point[i-1][1] - Integer.parseInt(order[1]);
                break;
            default:
                point[i][1] = point[i-1][1] + Integer.parseInt(order[1]);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int[][] point = new int[6][2];

        for (int i = 1; i < point.length; i++) {
            String order = sc.nextLine();
            move(order, point, i);
        }

        for (int i = 0; i < point.length; i++) {
            System.out.println(point[i][0] + " "+ point[i][1]);
        }

    }
}
