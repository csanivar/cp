package org.csanivar.atcoder.abc319;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    static Map<String, Integer> mp = Map.of(
            "tourist", 3858,
            "ksun48", 3679,
            "Benq", 3658,
            "Um_nik", 3648,
            "apiad", 3638,
            "Stonefeang", 3630,
            "ecnerwala", 3613,
            "mnbvmar", 3555,
            "newbiedmy", 3516,
            "semiexp", 3481
    );
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mp.get(sc.next()));
    }
}
