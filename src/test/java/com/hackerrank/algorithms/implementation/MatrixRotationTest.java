package com.hackerrank.algorithms.implementation;

import org.junit.Assert;
import org.junit.Test;

public class MatrixRotationTest {

	@Test
	public void test0() {
		Integer[][] expected = {
				{ 2, 3, 4, 8 },
				{ 1, 7, 11, 12 },
				{ 5, 6, 10, 16 },
				{ 9, 13, 14, 15 }
		};

		Integer[][] input = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};

		Integer nTimes = 1;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void test1() {
		Integer[][] expected = {
				{ 3, 4, 8, 12 },
				{ 2, 11, 10, 16 },
				{ 1, 7, 6, 15 },
				{ 5, 9, 13, 14 }
		};

		Integer[][] input = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};

		Integer nTimes = 2;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void test2() {
		Integer[][] expected = {
				{ 28, 27, 26, 25 },
				{ 22, 9, 15, 19 },
				{ 16, 8, 21, 13 },
				{ 10, 14, 20, 7 },
				{ 4, 3, 2, 1 }
		};

		Integer[][] input = {
				{ 1, 2, 3, 4 },
				{ 7, 8, 9, 10 },
				{ 13, 14, 15, 16 },
				{ 19, 20, 21, 22 },
				{ 25, 26, 27, 28 }
		};

		Integer nTimes = 7;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void test3() {
		Integer[][] expected = {
				{ 1, 1 },
				{ 1, 1 }
		};

		Integer[][] input = {
				{ 1, 1 },
				{ 1, 1 }
		};

		Integer nTimes = 3;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void testShouldReturnSameMatrixAsTheNumberOfElementsInMatrixIsEqualsToTheNumbersOfTimesToBeRotated() {
		Integer[][] expected = {
				{ 1, 2 },
				{ 3, 4 }
		};

		Integer[][] input = {
				{ 1, 2 },
				{ 3, 4 }
		};

		Integer nTimes = 4;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void testShouldReturnSameMatrixAsTheNumberOfElementsInMatrixIsMultipleOfTheNumbersOfTimesToBeRotated() {
		Integer[][] expected = {
				{ 1, 2 },
				{ 3, 4 }
		};

		Integer[][] input = {
				{ 1, 2 },
				{ 3, 4 }
		};

		Integer nTimes = 8;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void testBigArray() {
		Integer[][] expected = {
				{ 2, 3, 4, 5, 6, 12 },
				{ 1, 9, 10, 11, 17, 18 },
				{ 7, 8, 16, 22, 23, 24 },
				{ 13, 14, 15, 21, 29, 30 },
				{ 19, 20, 26, 27, 28, 36 },
				{ 25, 31, 32, 33, 34, 35 },
		};

		Integer[][] input = {
				{ 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 },
		};

		Integer nTimes = 1;

		Integer[][] output = MatrixRotation.rotate(input, nTimes);

		Assert.assertArrayEquals(expected, output);
	}
}
