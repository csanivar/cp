package org.csanivar.atcoder.abc314;

import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> bets = new ArrayList<>();
        List<Set<Integer>> nums = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int c = sc.nextInt();
            Set<Integer> st = new HashSet<>();
            for(int j=0; j<c; j++) {
                st.add(sc.nextInt());
            }
            bets.add(c);
            nums.add(st);
        }
        int x = sc.nextInt();
        List<Integer> winners = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if (nums.get(i).contains(x)) {
                winners.add(i);
            }
        }
        if (winners.size() == 0) {
            System.out.println(0);
        } else {
            int min = bets.get(winners.get(0));
            for(int i=1; i<winners.size(); i++) {
                min = Math.min(min, bets.get(winners.get(i)));
            }
            List<Integer> ans = new ArrayList<>();
            for(int i=0; i<winners.size(); i++) {
                if (bets.get(winners.get(i)) == min) {
                    ans.add(winners.get(i));
                }
            }
            System.out.println(ans.size());
            for(int i=0; i<ans.size(); i++) {
                System.out.print(ans.get(i)+1);
                if (i != ans.size()-1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
