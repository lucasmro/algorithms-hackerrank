package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class SimpleArraySumTest {

	@Test
	public void testShouldReturnTenWhenInputsAreOneAndTwoAndThreeAndFour() {
		int expected = 10;
		String[] input = {"1", "2", "3", "4"};
		int result = SimpleArraySum.solveMeFirst(input);
		Assert.assertEquals(expected, result);
	}
}
