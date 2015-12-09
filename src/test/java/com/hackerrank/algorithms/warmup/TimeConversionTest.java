package com.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;


public class TimeConversionTest {

	@Test
	public void testConversionMorning() {
		String input = "08:25:35AM";
		String expected = "08:25:35";

		String result = TimeConversion.convert(input);

		Assert.assertEquals(expected, result);
	}

	@Test
	public void testConversionAfterNoon() {
		String input = "07:05:45PM";
		String expected = "19:05:45";

		String result = TimeConversion.convert(input);

		Assert.assertEquals(expected, result);
	}

	@Test
	public void testConversionWhenMidnight() {
		String input = "12:00:00AM";
		String expected = "00:00:00";

		String result = TimeConversion.convert(input);

		Assert.assertEquals(expected, result);
	}

	@Test
	public void testConversionWhenNoon() {
		String input = "12:00:00PM";
		String expected = "12:00:00";

		String result = TimeConversion.convert(input);

		Assert.assertEquals(expected, result);
	}
}
