package org.csanivar.atcoder.abc314;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        List<List<Integer>> cs = new ArrayList<>();
        for(int i=0; i<m; i++) {
            cs.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++) {
            int c = sc.nextInt();
            cs.get(c-1).add(i);
        }
        char[] arr = s.toCharArray();
        for(int i=0; i<m; i++) {
            // right rotate by 1
            List<Integer> idxs = cs.get(i);
            char next = arr[idxs.get(idxs.size()-1)];
            for(int j=0; j<idxs.size(); j++) {
                char tmp = arr[idxs.get(j)];
                arr[idxs.get(j)] = next;
                next = tmp;
            }
        }

        System.out.println(new String(arr));
    }
}
