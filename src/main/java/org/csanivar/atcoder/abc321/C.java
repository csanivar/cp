package org.csanivar.atcoder.abc321;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        findAll();
        System.out.println(list.size());
        int cnt = 0;
        System.out.println(list.get(cnt-1));
//        for(long i=1; i<Long.MAX_VALUE; i++) {
//            if (is321(i)) {
//                cnt++;
//                if (cnt == k) {
//                    System.out.println(i);
//                    return;
//                }
//            }
//        }
    }

    private static void findAll() {
        for(long i=1; i<Long.MAX_VALUE; i++) {
            if (is321(i)) {
                list.add(i);
            }
        }
    }

    private static boolean is321(long n) {
        char s[] = String.valueOf(n).toCharArray();
        if (s.length == 1) {
            return true;
        }
        int prev = s[0] - '0';
        for(int i=1; i<s.length; i++) {
            int curr = s[i] - '0';
            if (prev <= curr) {
                return false;
            }
            prev = curr;
        }

        return true;
    }
}
