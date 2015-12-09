package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;


public class StaircaseTest {

	@Test
	public void testShouldReturnFiveBlankCharsAndOneSymbolWhenHeightIsSixAndLineNumberIsOne() {
		int height = 6;
		int lineNumber = 1;
		String expected = "     #";

		Staircase.PrintStair printStair = new Staircase.PrintStair(height);
		String result = printStair.print(lineNumber);

		Assert.assertEquals(expected, result);
	}
}
