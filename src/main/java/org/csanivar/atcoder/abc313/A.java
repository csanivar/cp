package org.csanivar.atcoder.abc313;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=1; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
        int ans = arr[0] <= max ? max - arr[0]+1 : 0;
        System.out.println(ans);
    }
}
