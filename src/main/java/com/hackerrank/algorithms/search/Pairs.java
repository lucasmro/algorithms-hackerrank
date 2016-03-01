package com.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);

        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = pairs(_a, _k);
        System.out.println(res);
    }

    static int pairs(int[] a, int k) {
        int p = 0;
        int index = 0;

        Arrays.sort(a);

        while (index < a.length - 1) {
            for (int i = index; i < a.length - 1; i++) {
                int diff = Math.abs(a[index] - a[i + 1]);

                if (diff == k) {
                    p++;
                } else if (diff > k) {
                    break;
                }
            }

            index++;
        }

        return p;
    }
}
