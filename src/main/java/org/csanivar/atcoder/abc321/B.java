package org.csanivar.atcoder.abc321;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int a[] = new int[n-1];
        int sum = 0;
        for(int i=0; i<n-1; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        // if answer is new min
        int res1 = sum - a[n-2];
        // res1 should be at least x;
        if (res1 >= x) {
            System.out.println(0);
            return;
        }
        // if answer is somewhere b/w
        int res2 = sum - a[0] - a[n-2];
        res2 = x - res2; // how much more I need
        if (res2 <= a[n-2]) {
            System.out.println(res2);
            return;
        }
        // if answer is new max
        int res3 = sum - a[0];
        if (res3 >= x) {
            System.out.println(a[n-2]+1);
            return;
        }

        System.out.println(-1);
    }
}
