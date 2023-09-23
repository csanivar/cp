package org.csanivar.atcoder.abc314;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {
    private record Ope(int t, int x, char c) {}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int q = sc.nextInt();
        List<Ope> ops = new ArrayList<>();
        while(q-- > 0) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            ops.add(new Ope(t, x, c));
        }
        int lastChange = -1;
        for(int i=0; i<ops.size(); i++) {
            if (ops.get(i).t != 1) {
                lastChange = i;
            }
        }
        char[] arr = s.toCharArray();
        for(int i=0; i<ops.size(); i++) {
            Ope op = ops.get(i);
            if (i != lastChange) {
                if (op.t == 1) {
                    arr[op.x-1] = op.c;
                }
            } else {
                if (op.t == 2) {
                    for(int j=0; j<n; j++) {
                        arr[j] = Character.toLowerCase(arr[j]);
                    }
                } else {
                    for(int j=0; j<n; j++) {
                        arr[j] = Character.toUpperCase(arr[j]);
                    }
                }
            }
        }

        System.out.println(new String(arr));
    }
}
