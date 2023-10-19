package org.csanivar.atcoder.abc321;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[m];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        for(int i=0; i<m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long ans = 0;
        if (n <= m) {
            ans = solve(a, b, p);
        } else {
            ans = solve(b, a, p);
        }

        System.out.println(ans);
    }

    private static long solve(long a[], long b[], int p) {
        // assuming a and b are sorted and a.length <= b.length
        int n = a.length, m = b.length;
        long pre[] = new long[m];
        for(int i=0; i<m; i++) {
            pre[i] = b[i];
            if (i > 0) {
                pre[i] += pre[i-1];
            }
        }
        long ans = 0;
        for (long l : a) {
            if (l >= p) {
                ans += ((long) p * m);
            } else {
                long rem = p - l;
                int idx = search(b, rem)-1;
                if (idx < 0) {
                    ans += ((long) p * m);
                    continue;
                }
                ans += ((l * (idx + 1)) + pre[idx]);
                ans += ((long) p * (m - idx - 1));
            }
        }

        return ans;
    }

    // return index of first element > target
    private static int search(long arr[], long target) {
        int lo = 0, hi = arr.length-1;
        while (lo < hi) {
            int mid = (lo+hi)/2;
            if (arr[mid] <= target) {
                lo = mid+1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }
}
