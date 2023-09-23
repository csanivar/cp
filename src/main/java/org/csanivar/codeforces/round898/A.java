package org.csanivar.codeforces.round898;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            int off = 0;
            if (s.charAt(0) != 'a') {
                off++;
            }
            if (s.charAt(1) != 'b') {
                off++;
            }
            if (s.charAt(2) != 'c') {
                off++;
            }
            if (off <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
