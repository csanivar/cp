package org.csanivar.codeforces.round898;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            char s[] = sc.next().toCharArray();
            int n = s.length;
            int ans = 0;
            int i = 0;
            while (i < n-1) {
                if (s[i] == 'A') {
                    int j = i+1;
                    while (j < n && s[j] == 'A') {
                        j++;
                    }
                    if (j < n) {
                        ans += j-i;
                    }
                    i = j+1;
                } else {
                    int j = i+1;
                    while (j < n && s[j] == 'A') {
                        j++;
                    }
                    ans += j-i-1;
                    i = j;
                }
            }
            System.out.println(ans);
        }
    }
}
