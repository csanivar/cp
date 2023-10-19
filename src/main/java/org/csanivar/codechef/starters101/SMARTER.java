package org.csanivar.codechef.starters101;

import java.util.Scanner;

public class SMARTER {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt(), v1 = sc.nextInt(), v2 = sc.nextInt();
            int t1 = (int) Math.ceil((double) l / v1);
            int t2 = (int) Math.ceil((double) l / v2);
            int d = t1 - t2 - 1;
            if (d < 0) {
                System.out.println(-1);
            } else {
                System.out.println(d);
            }
        }
    }
}
