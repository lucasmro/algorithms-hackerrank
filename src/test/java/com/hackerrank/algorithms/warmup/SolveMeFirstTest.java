package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class SolveMeFirstTest {

	@Test
	public void testShouldReturnFourWhenFirstInputIsTwoAndSecondInputIsTwo() {
		int expected = 4;
		int result = SolveMeFirst.solveMeFirst(2, 2);

		Assert.assertEquals(expected, result);
	}

	@Test
	public void testShouldReturnTenWhenFirstInputIsThreeAndSecondInputIsSeven() {
		int expected = 10;
		int result = SolveMeFirst.solveMeFirst(3, 7);

		Assert.assertEquals(expected, result);
	}
}
