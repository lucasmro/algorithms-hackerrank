package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class AVeryBigSumTest {
	@Test
	public void testShouldReturnAVeryBigNumbers() {
		long expected = 5000000015L;
		String[] input = { "1000000001", "1000000002", "1000000003", "1000000004", "1000000005" };
		long result = AVeryBigSum.solveMeFirst(input);
		Assert.assertEquals(expected, result);
	}
}
