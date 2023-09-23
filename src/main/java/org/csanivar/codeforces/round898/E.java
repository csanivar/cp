package org.csanivar.codeforces.round898;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int hi =  1000000001;
            int lo = 1;
            while (lo < hi) {
                int mid = (lo+hi)/2;
                long water = 0;
                for(int i=0; i<n; i++) {
                    water += Math.max(0, mid-a[i]);
                }
                if (water == x) {
                    lo = mid;
                    break;
                } else if (water < x) {
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }

            System.out.println(lo);
        }
    }
}
