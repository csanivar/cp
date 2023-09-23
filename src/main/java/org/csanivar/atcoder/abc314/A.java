package org.csanivar.atcoder.abc314;

import java.util.Scanner;

public class A {
    private static String PI = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(PI.substring(0, n+2));
    }
}
