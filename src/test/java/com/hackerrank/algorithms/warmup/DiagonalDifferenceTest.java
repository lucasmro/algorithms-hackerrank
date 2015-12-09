package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;


public class DiagonalDifferenceTest {

	@Test
	public void calculateDiagonalDifference() {
		int expected = 15;
		Integer[][] matrix = { {11, 2, 4}, {4, 5, 6}, {10, 8, -12} };

		int result = DiagonalDifference.calculate(matrix);

		Assert.assertEquals(expected, result);
	}
}
