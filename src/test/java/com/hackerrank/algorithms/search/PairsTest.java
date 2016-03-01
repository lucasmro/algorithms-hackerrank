package com.hackerrank.algorithms.search;

import org.junit.Assert;
import org.junit.Test;

public class PairsTest {

    @Test
    public void test() {
        int[] a = { 1, 5, 3, 4, 2 };
        int k = 2;

        int expected = 3;

        int output = Pairs.pairs(a, k);

        Assert.assertEquals(expected, output);
    }
}
