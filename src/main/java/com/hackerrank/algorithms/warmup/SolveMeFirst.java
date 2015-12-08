package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Let's start simple. Can you complete the function solveMeFirst to return the
 * sum of two integers passed as input parameters? You can pick your favorite
 * programming language.
 *
 * @see https://www.hackerrank.com/challenges/solve-me-first
 */
public class SolveMeFirst {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
