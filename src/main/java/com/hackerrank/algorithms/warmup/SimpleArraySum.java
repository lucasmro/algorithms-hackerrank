package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement
 * You are given an array of integers of size N. Can you find the sum of the
 * elements in the array?
 *
 * Input
 * The first line of input consists of an integer N. The next line
 * contains N space-separated integers representing the array elements. Sample:
 *
 * 6
 * 1 2 3 4 10 11
 *
 * Output
 * Output a single value equal to the sum of the elements
 * in the array. For the sample above you would just print 31 since
 * 1+2+3+4+10+11=31.
 *
 * @see https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		String b = in.nextLine();
		String[] values = b.split("\\s+");

		int sum = solveMeFirst(values);
		System.out.println(sum);
	}

	static int solveMeFirst(String[] values) {
		int sum = 0;

		for (String value : values) {
			int val = Integer.parseInt(value);
			sum += val;
		}

		return sum;
	}
}
