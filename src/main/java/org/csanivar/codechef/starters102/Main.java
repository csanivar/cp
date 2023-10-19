package org.csanivar.codechef.starters102;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        A();
    }

    private static void A() {
        Scanner sc = new Scanner(System.in);
    }

    private static void B() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            double income = 0.2 * x;
            System.out.println(Math.ceil(100/income));
        }
    }

    private static void C() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p[] = new int[n];
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++) {
                p[i] = sc.nextInt();
                sum += p[i];
                min = Math.min(min, p[i]);
            }
            System.out.println(sum - min);
        }
    }

    private static void D() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int y = (k-n/2)/2;
            if ((k-n/2)%2 != 0 || y-n+2 < 0) {
                System.out.println("-1");
                continue;
            }
            int a[] = new int[n];
            for(int i=0; i<n/2; i++) {
                a[i] = 1;
            }
            for(int i=n/2; i<n-1; i++) {
                a[i] = 2;
            }
            a[n-1] = 2*(y-n+2);
            String ans = Arrays.stream(a)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.println(ans);
        }
    }

    private static void E() {
        Scanner sc = new Scanner(System.in);
        long MOD = 1000000007;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ol = (n-1)/2;
            int ope[] = new int[ol];
            for (int i=0; i<(n-1)/2; i++) {
                int a = s.charAt(2*i) - '0';
                int b = s.charAt(2*i+1) - '0';
                int c = s.charAt(2*i+2) - '0';
                int op = 0;
                if ((a & b) == c) op++;
                if ((a | b) == c) op++;
                if ((a ^ b) == c) op++;
                ope[i] = op;
            }
            long ans = ope[0];
            for(int i=1; i<ope.length; i++) {
                ans = (ans * ope[i]) % MOD;
            }
            System.out.println(ans);
        }
    }

    private static void F() {
        Scanner sc = new Scanner(System.in);
    }
}
