package com.hackerrank.contests.hourrank5;

import java.util.Scanner;

public class XorSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();

        int[] A = new int[Q];

        for (int a0 = 0; a0 < Q; a0++) {
            long L = in.nextLong();
            long R = in.nextLong();

            long x = getVal(L);
            for (long i = L + 1; i <= R; i++) {
                x ^= getVal(i);
            }
            System.out.println(x);
        }
    }

    public static long getVal(long i) {
        long mod = i % 4;

        if (mod == 1) {
            return 1;
        } else if (mod == 2) {
            return i + 1;
        } else if (mod == 3) {
            return 0;
        }

        return i; // i % 4 == 0
    }
}
