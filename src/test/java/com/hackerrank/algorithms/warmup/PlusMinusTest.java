package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class PlusMinusTest {

	@Test
	public void testShouldCalculateFractionsOfIntegerNumbers() {
		String[] expectedResult = {"0.500000", "0.333333", "0.166667"};
		int[] numbers = {-4, 3, -9, 0 , 4, 1};

		String[] result = PlusMinus.calculate(numbers);

		Assert.assertEquals(3, result.length);
		Assert.assertArrayEquals(expectedResult, result);
	}
}
