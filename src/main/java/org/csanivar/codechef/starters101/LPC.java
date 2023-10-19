package org.csanivar.codechef.starters101;

import java.util.Scanner;

public class LPC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            char s[] = sc.next().toCharArray(), k[] = sc.next().toCharArray();
            int min = Integer.MAX_VALUE;
            for(int i=0; i<=n-1; i++) {
                min = Math.min(min, dist(s, k, i));
            }
            System.out.println(min);
        }
    }

    private static int dist(char s[], char k[], int start) {
        if (start+k.length-1 >= s.length) {
            return Integer.MAX_VALUE;
        }
        int dist = 0;
        for(int i=0; i<k.length; i++) {
            // k = 0; s = 9; minDiff = 1;
            // k = 1; s = 5; minDiff = 4;
            // k = 1; s = 8; minDiff = 2;
            if (start+i >= s.length) return Integer.MAX_VALUE;
            int ki = k[i] - '0', si = s[start+i] - '0';
            int forward = (ki - si) < 0 ? 10-si+ki : ki-si;
            int backward = si-ki < 0 ? 10-ki+si : si-ki;
            int minDiff = Math.min(forward, backward);
            dist += minDiff;
        }

        return dist;
    }
}
