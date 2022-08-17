package step_by_step.level2;

import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c) {
            System.out.print(10000+a*1000);
        } else if (a==b && b!=c) {
            System.out.print(1000+a*100);
        } else if (a==c && b!=c) {
            System.out.print(1000+a*100);
        } else if (c==b && a!=c) {
            System.out.print(1000+b*100);
        } else {
            int big = a;
            if( b> big) {
                big = b;
            }
            if(c>big) {
                big = c;
            }
            System.out.print(big*100);
        }
    }
}
