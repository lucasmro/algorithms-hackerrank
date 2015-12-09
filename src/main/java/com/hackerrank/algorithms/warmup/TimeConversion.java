package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.nextLine();

		String newTime = convert(time);
		System.out.println(newTime);
	}

	static String convert(String input) {
		String[] originalTime = input.substring(0, 8).split(":");
		int originalHour = Integer.parseInt(originalTime[0]);
		int originalMinute = Integer.parseInt(originalTime[1]);
		int originalSecond = Integer.parseInt(originalTime[2]);

		boolean isPM = input.substring(8, 10).equals("PM");

		if (isPM && originalHour < 12) {
			originalHour += 12;
		} else if (!isPM && originalHour == 12) {
			originalHour = 0;
		}

		return String.format("%02d:%02d:%02d", originalHour, originalMinute, originalSecond);
	}
}
