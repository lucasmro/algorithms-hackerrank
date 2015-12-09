package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement
 *
 * Given a square matrix of size N×N, calculate the absolute difference between
 * the sums of its diagonals.
 *
 * Input Format
 *
 * The first line contains a single integer, N. The next N lines
 * denote the matrix's rows, with each line containing N space-separated
 * integers describing the columns.
 *
 * Output Format
 *
 * Print the absolute difference between the two sums of the
 * matrix's diagonals as a single integer.
 *
 * Sample Input
 *
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 *
 * Sample Output
 *
 * 15
 *
 * Explanation
 *
 * The primary diagonal is:
 *
 * 11
 * 		5
 * 			-12
 *
 * Sum across the primary diagonal:
 * 11 + 5 - 12 = 4
 *
 * The secondary diagonal is:
 *
 * 			4
 * 		5
 * 10
 *
 * Sum across the secondary diagonal:
 * 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 *
 * @see https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();

		Integer[][] matrix = new Integer[a][a];

		for (int i = 0; i < a; i++) {
			String nextLine = in.nextLine();
			String[] lineValues = nextLine.split("\\s+");

			for (int j = 0; j < lineValues.length; j++) {
				matrix[i][j] = Integer.parseInt(lineValues[j]);
			}
		}

		int result = calculate(matrix);
		System.out.println(result);
	}

	static int calculate(Integer[][] matrix) {
		int a = 0;
		int b = 0;
		int size = matrix.length;

		for (int i = 0; i < size; i++) {
			a += matrix[i][i];
			b += matrix[i][size - 1 - i];
		}

		return Math.abs(a - b);
	}
}
