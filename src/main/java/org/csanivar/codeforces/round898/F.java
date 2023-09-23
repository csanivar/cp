package org.csanivar.codeforces.round898;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int h[] = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++) {
                h[i] = sc.nextInt();
            }
            int ans = 0;
            int l = 0, r = 0;
            int cnt = 0;
            while (r < n) {
                if (l == r) { // nothing behind
                    if (a[r] <= k) {
                        cnt += a[r];
                        r++;
                    } else {
                        l++;
                        r++;
                    }
                } else {
                    if (h[r-1] % h[r] == 0) { // check if divisible
                        // is divisible
                        if (a[r] + cnt <= k) { // check if I can add more apples
                            // I can add more apples
                            cnt += a[r];
                            r++;
                        } else {
                            // I can't add more apples
                            ans = Math.max(ans, r-l);
                            cnt -= a[l];
                            l++;
                        }
                    } else {
                        // is not divisible
                        ans = Math.max(ans, r-l);
                        cnt = 0;
                        l = r;
                    }
                }
            }
            ans = Math.max(ans, r-l);
            System.out.println(ans);
        }
    }
}
