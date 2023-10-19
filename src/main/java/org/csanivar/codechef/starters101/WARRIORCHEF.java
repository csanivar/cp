package org.csanivar.codechef.starters101;

import java.util.Arrays;
import java.util.Scanner;

public class WARRIORCHEF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), h = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int sum = 0;
            int x = 0;
            for(int i=n-1; i>=0; i--) {
                sum += a[i];
                if (sum >= h) {
                    // this means, Chef will die if he faces this warrior.
                    x = a[i];
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
