package org.csanivar.atcoder.abc322;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        C();
    }

    private static void A() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        for(int i=0; i<s.length-2; i++) {
            if (s[i] == 'A' && s[i+1] == 'B' && s[i+2] == 'C') {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("-1");
    }

    private static void B() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        char s[] = sc.next().toCharArray(), t[] = sc.next().toCharArray();
        boolean prefix = true, suffix = true;
        for(int i=0; i<n; i++) {
            if (s[i] != t[i]) {
                prefix = false;
                break;
            }
        }

        for(int i=0; i<n; i++) {
            if (s[i] != t[m-n+i]) {
                suffix = false;
                break;
            }
        }

        if (prefix && suffix) {
            System.out.println(0);
        } else if (prefix) {
            System.out.println(1);
        } else if (suffix) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    private static void C() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i=1; i<=n; i++) {
            int next = a[idx] - i;
            if (next == 0) {
                idx++;
            }
            System.out.println(next);
        }
    }
}
