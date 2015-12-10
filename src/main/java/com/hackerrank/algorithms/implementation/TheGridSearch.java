package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * @see https://www.hackerrank.com/challenges/the-grid-search
 */
public class TheGridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfTestCases = in.nextInt();

		in.nextLine();

		for (int i = 0; i < numOfTestCases; i++) {
			Integer[][] largerGrid = readInput(in);
			Integer[][] searchPattern = readInput(in);

			String result = contains(largerGrid, searchPattern);
			System.out.println(result);
		}

	}

	static String contains(Integer[][] largerGrid, Integer[][] searchSubGrid) {

		if (searchSubGrid.length == 0 || largerGrid.length == 0) {
			return "NO";
		}

		if (searchSubGrid.length > largerGrid.length) {
			return "NO";
		}

		int largerGridNumRows = largerGrid.length;
		int largerGridNumCols = largerGrid[0].length;
		int subGridNumCols = searchSubGrid[0].length;
		int subGridNumRows = searchSubGrid.length;

		for (int i = 0; i < largerGrid.length; i++) {
			for (int j = 0; j < largerGrid[i].length; j++) {

				if ((largerGridNumCols - j >= subGridNumCols) &&
					(largerGridNumRows - i >= subGridNumRows) &&
					(largerGrid[i][j] == searchSubGrid[0][0])) {

					int countFound = 0;
					boolean found = false;

					do {
						found = searchInLine(largerGrid, searchSubGrid, i + countFound, j, countFound);

						if (found) {
							countFound++;
						} else {
							countFound = 0;
						}

					} while (found == true && countFound < subGridNumRows);

					if (countFound == subGridNumRows) {
						return "YES";
					}

				}

			}
		}

		return "NO";
	}

	private static boolean searchInLine(Integer[][] largerGrid, Integer[][] searchPattern, int a, int b, int x) {
		Integer[] line = searchPattern[x];
		int subGridNumCols = searchPattern[x].length;

		int count = 0;

		for (int i = 0; i < line.length; i++) {
			if (line[i] == largerGrid[a][b + i]) {
				count++;
			}
		}

		return count == subGridNumCols;
	}

	private static Integer[][] readInput(Scanner in) {
		String nextLineDimensions = in.nextLine();
		String[] largerGridDimensions = nextLineDimensions.split("\\s+");

		int x = Integer.parseInt(largerGridDimensions[0]);
		int y = Integer.parseInt(largerGridDimensions[1]);
		Integer[][] matrix = new Integer[x][y];

		for (int i = 0; i < x; i++) {
			String nextLineValues = in.nextLine();
			char[] line = nextLineValues.toCharArray();

			for (int j = 0; j < line.length; j++) {
				matrix[i][j] = (int) line[j];
			}
		}

		return matrix;
	}
}
