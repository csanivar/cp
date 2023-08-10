package org.csanivar.atcoder.abc313;

import java.util.*;

public class B {

    private static Map<Integer, Set<Integer>> gm;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Set<Integer>> mp = new HashMap<>();
        gm = new HashMap<>();
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(!mp.containsKey(a)) {
                mp.put(a, new HashSet<>());
            }
            mp.get(a).add(b);
        }

        for(int i=1; i<=n; i++) {
            if (dfs(i, mp).size() == n-1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    private static Set<Integer> dfs(int src, Map<Integer, Set<Integer>> mp) {
        if (!mp.containsKey(src)) {
            return new HashSet<>();
        }
        if (gm.containsKey(src)) {
            return gm.get(src);
        }
        Set<Integer> st = new HashSet<>();
        for(int val: mp.get(src)) {
            st.add(val);
            st.addAll(dfs(val, mp));
        }

        gm.put(src, st);
        return st;
    }
}
