package com.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Problem Statement
 *
 * Given an array of integers, calculate which fraction of the elements are
 * positive, negative, and zeroes, respectively. Print the decimal value of each
 * fraction.
 *
 * Input Format
 *
 * The first line, N, is the size of the array. The second line contains N
 * space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).
 *
 * Output Format
 *
 * Print each value on its own line with the fraction of positive numbers first,
 * negative numbers second, and zeroes third.
 *
 * Sample Input
 *
 * 6
 * 4 3 -9 0 4 1
 *
 * Sample Output
 *
 * 0.500000
 * 0.333333
 * 0.166667
 *
 * Explanation
 *
 * There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 * The fraction of the positive numbers, negative numbers and zeroes are
 * 3/6 = 0.500000, 2/6 = 0.333333 and 1/6 = 0.166667, respectively.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled
 * to six decimal places, though answers with absolute error of up to 10−4 are
 * acceptable.
 *
 * @see https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		String b = in.nextLine();
		String[] values = b.split("\\s+");

		int[] numbers = new int[a];
		for (int i = 0; i < values.length; i++) {
			numbers[i] = Integer.parseInt(values[i]);
		}

		String[] result = calculate(numbers);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static String[] calculate(int[] numbers) {
		int size = numbers.length;
		int positive = 0;
		int zeros = 0;
		int negative = 0;

		for (int i = 0; i < size; i++) {
			if (numbers[i] > 0) {
				positive++;
			} else if (numbers[i] < 0) {
				negative++;
			} else {
				zeros++;
			}
		}

		DecimalFormat df = new DecimalFormat("#.######");
		df.setMinimumFractionDigits(6);

		Double positiveFraction = (double) positive / (double) size;
		Double negativeFraction = (double) negative / (double) size;
		Double zeroFraction = (double) zeros / (double) size;

		String[] result = new String[3];
		result[0] = df.format(positiveFraction.doubleValue());
		result[1] = df.format(negativeFraction.doubleValue());
		result[2] = df.format(zeroFraction.doubleValue());

		return result;
	}

}
