package org.csanivar.atcoder.abc321;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        if (s.length == 1) {
            System.out.println("Yes");
            return;
        } else {
            int prev = s[0] - '0';
            for(int i=1; i<s.length; i++) {
                int curr = s[i] - '0';
                if (prev <= curr) {
                    System.out.println("No");
                    return;
                }
                prev = curr;
            }
        }

        System.out.println("Yes");
    }
}
