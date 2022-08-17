package step_by_step.level3;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=1;i<=9;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
