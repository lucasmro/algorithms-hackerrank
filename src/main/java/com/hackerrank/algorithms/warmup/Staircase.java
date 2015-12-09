package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement
 *
 * Your teacher has given you the task of drawing a staircase structure. Being
 * an expert programmer, you decided to make a program to draw it for you
 * instead. Given the required height, can you print a staircase as shown in the
 * example?
 *
 * Input
 * You are given an integer N depicting the height of the staircase.
 *
 * Output
 * Print a staircase of height N that consists of # symbols and spaces.
 * For example for N=6, here's a staircase of that height:
 *
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 *
 * Note: The last line has 0 spaces before it.
 *
 * @see https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {

	static class PrintStair {
		private int height;
		private String blank = "";
		private String symbol = "#";

		public PrintStair(int height) {
			this.height = height;

			for (int i = 0; i < this.height - 1; i++) {
				blank += " ";
				symbol += "#";
			}
		}

		public String print(int i) {
			String a = blank.substring(0, this.height - 1 - i);
			String b = symbol.substring(this.height - 1 - i);
			return a + b;
		}
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		PrintStair printStair = new PrintStair(n);

		for (int i = 0; i < n; i++) {
			System.out.println(printStair.print(i));
		}
	}
}
