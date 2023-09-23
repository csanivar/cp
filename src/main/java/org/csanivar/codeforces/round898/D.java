package org.csanivar.codeforces.round898;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char s[] = sc.next().toCharArray();
            int ans = 0;
            int i = 0;
            while (i < n) {
                if (s[i] == 'B') {
                    ans++;
                    i += k;
                } else {
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
