package org.csanivar.codeforces.round895;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >= 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = (int) Math.ceil(((double) Math.abs(a - b) / 2) / c);
            System.out.println(ans);
        }
    }
}
