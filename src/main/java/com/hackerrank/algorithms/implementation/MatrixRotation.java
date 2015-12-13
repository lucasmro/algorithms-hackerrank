package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String b = in.nextLine();
		String[] values = b.split("\\s+");

		int m = Integer.parseInt(values[0]);
		int n = Integer.parseInt(values[1]);
		int rotate = Integer.parseInt(values[2]);

		Integer[][] input = new Integer[m][n];

		for (int i = 0; i < m; i++) {
			String nextLine = in.nextLine();
			String[] line = nextLine.split("\\s+");

			for (int j = 0; j < n; j++) {
				input[i][j] = Integer.parseInt(line[j]);
			}
		}

		Integer[][] output = rotate(input, rotate);

		print(output);
	}

	static Integer[][] rotate(Integer[][] input, Integer nTimes) {

		int numRows = input.length;
		int numColumns = input[0].length;
		int numElements = numRows * numColumns;

		// Rotate to the starting position
		if (nTimes % numElements == 0) {
			return input;
		}

		// Reduce number of rotations
		if (nTimes > numElements) {
			int x = nTimes / numElements;
			nTimes = nTimes - (numElements * x);
		}

		int aux = 0;
		while (aux++ < nTimes) {
			input = rotate(input, numRows, numColumns);
		}

		return input;
	}

	private static Integer[][] rotate(Integer[][] input, int numRows, int numColumns) {
		Integer[][] output = new Integer[numRows][numColumns];

		int x = numRows / 2;
		for (int i = 0; i < x; i++) {
			rotateInLine(input, output, numRows, numColumns, i);
		}

		int y = numColumns / 2;
		for (int i = 0; i < y; i++) {
			rotateInColumn(input, output, numRows, numColumns, i);
		}

		return output;
	}

	private static void rotateInLine(Integer[][] input, Integer[][] output, int numRows, int numColumns, int layer) {
		int firstLine = layer;
		int lastLine = numRows - 1 - layer;

		int start = layer;
		int end = numColumns - 1 - layer;

		for (int i = start; i < end; i++) {
			output[firstLine][i] = input[firstLine][i + 1];
			output[lastLine][end - i + layer] = input[lastLine][end - i - 1 + layer];
		}
	}

	private static void rotateInColumn(Integer[][] input, Integer[][] output, int numRows, int numColumns, int layer) {
		int firstColumn = layer;
		int lastColumn = numColumns - 1 - layer;

		int start = layer;
		int end = numRows - 1 - layer;

		for (int i = start; i < end; i++) {
			output[end - i + layer][firstColumn] = input[end - i - 1 + layer][firstColumn];
			output[i][lastColumn] = input[i + 1][lastColumn];
		}
	}

	private static void print(Integer[][] output) {
		int numRows = output.length;
		int numColumns = output[0].length;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
