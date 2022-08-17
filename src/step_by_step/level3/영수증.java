package step_by_step.level3;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = sc.nextInt();
        int sum2 = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String object = sc.nextLine();
            String[] objectInfo = object.split(" ");
            sum2 += (Integer.parseInt(objectInfo[0]))*(Integer.parseInt(objectInfo[1]));
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
