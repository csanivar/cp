package org.csanivar.atcoder.abc319;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=1; i<10; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=n; i++) {
            int a = -1;
            for(int j: arr) {
                if (i % (n/j) == 0) {
                    a = j;
                    break;
                }
            }
            if (a != -1) {
                sb.append(a);
            } else {
                sb.append("-");
            }
        }

        System.out.println(sb.toString());
    }
}
