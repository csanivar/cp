package org.csanivar.codeforces.round898;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            int min = 0;
            for(int i=1; i<n; i++) {
                if (a[min] > a[i]) {
                    min = i;
                }
            }
            a[min]++;
            int ans = 1;
            for(int i=0; i<n; i++) {
                ans *= a[i];
            }
            System.out.println(ans);
        }
    }
}
