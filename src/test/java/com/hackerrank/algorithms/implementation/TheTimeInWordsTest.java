package com.hackerrank.algorithms.implementation;

import org.junit.Assert;
import org.junit.Test;

public class TheTimeInWordsTest {

	@Test
	public void testShouldConvertTimeToFiveOClock() {
		String expected = "five o' clock";
		int hours = 5;
		int minutes = 0;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToOneMinutePastFive() {
		String expected = "one minute past five";
		int hours = 5;
		int minutes = 1;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToTenMinutesPastFive() {
		String expected = "ten minutes past five";
		int hours = 5;
		int minutes = 10;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToHalfPastFive() {
		String expected = "half past five";
		int hours = 5;
		int minutes = 30;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToTwentyMinutesToSix() {
		String expected = "twenty minutes to six";
		int hours = 5;
		int minutes = 40;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToQuarterToSix() {
		String expected = "quarter to six";
		int hours = 5;
		int minutes = 45;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToThirteenMinutesToSix() {
		String expected = "thirteen minutes to six";
		int hours = 5;
		int minutes = 47;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToTwentyEightMinutesPastFive() {
		String expected = "twenty eight minutes past five";
		int hours = 5;
		int minutes = 28;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToQuarterPastPastFour() {
		String expected = "quarter past four";
		int hours = 4;
		int minutes = 15;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}

	@Test
	public void testShouldConvertTimeToTweentyFiveMinutesToSeven() {
		String expected = "twenty five minutes to seven";
		int hours = 6;
		int minutes = 35;

		String output = TheTimeInWords.convert(hours, minutes);

		Assert.assertEquals(expected, output);
	}
}
