package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem Statement
 *
 * Given the time in numerals we may convert it into words, as shown below:
 *
 * 5:00 → five o' clock
 * 5:01 → one minute past five
 * 5:10 → ten minutes past five
 * 5:30 → half past five
 * 5:40 → twenty minutes to six
 * 5:45 → quarter to six
 * 5:47 → thirteen minutes to six
 * 5:28 → twenty eight minutes past five
 *
 * Write a program which prints the time in words for the input given in
 * the format mentioned above.
 *
 * Input Format
 *
 * There will be two lines of input:
 * H, representing the hours
 * M, representing the minutes
 *
 * Constraints
 * 1 ≤ H < 12
 * 0 ≤ M < 60
 *
 * Output Format
 *
 * Display the time in words.
 *
 * Sample Input
 *
 * 5
 * 47
 *
 * Sample Output
 *
 * thirteen minutes to six
 *
 * @see https://www.hackerrank.com/challenges/the-time-in-words
 */
public class TheTimeInWords {

	private static final String O_CLOCK = "o' clock";
	private static final String QUARTER_PAST = "quarter past";
	private static final String HALF = "half";
	private static final String PAST = "past";
	private static final String MINUTE = "minute";
	private static final String QUARTER_TO = "quarter to";
	private static final String TO = "to";
	private static final String TEEN = "teen";
	private static final String BLANK_SPACE = " ";

    private static final Map<Integer, String> numbersMap;

    static {
        numbersMap = new HashMap<Integer, String>();
        numbersMap.put(1, "one");
        numbersMap.put(2, "two");
        numbersMap.put(3, "three");
        numbersMap.put(4, "four");
        numbersMap.put(5, "five");
        numbersMap.put(6, "six");
        numbersMap.put(7, "seven");
        numbersMap.put(8, "eight");
        numbersMap.put(9, "nine");
        numbersMap.put(10, "ten");
        numbersMap.put(11, "eleven");
        numbersMap.put(12, "twelve");
        numbersMap.put(13, "thirteen");
        numbersMap.put(20, "twenty");
        numbersMap.put(30, "thirty");
        numbersMap.put(40, "fourty");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int minutes = in.nextInt();

        System.out.println(convert(hours, minutes));
    }

    static String convert(int hours, int minutes) {

        if (minutes == 0) {
            return buildPharse(convertNumberIntoWords(hours), O_CLOCK);
        }

        if (minutes == 15) {
            return buildPharse(QUARTER_PAST, convertNumberIntoWords(hours));
        }

        if (minutes == 30) {
            return buildPharse(HALF, PAST, convertNumberIntoWords(hours));
        }

        if (minutes == 45) {
            return buildPharse(QUARTER_TO, convertNumberIntoWords(hours + 1));
        }

        String literalMinutes = pluralizeString(minutes);

        if (minutes < 30) {
            return buildPharse(convertNumberIntoWords(minutes), literalMinutes, PAST, convertNumberIntoWords(hours));
        }

        return buildPharse(convertNumberIntoWords(60 - minutes), literalMinutes, TO, convertNumberIntoWords(hours + 1));
    }

	private static String pluralizeString(int minutes) {
		return (minutes > 1) ? String.format("%s%s", MINUTE, "s") : MINUTE;
	}

    private static String convertNumberIntoWords(int number) {
        int unit = number % 10;

        if (number > 13 && number < 20) {
            return numbersMap.get(unit) + TEEN;
        }

        if (number > 20 && number < 45) {
            return numbersMap.get(number - unit) + " " + numbersMap.get(unit);
        }

        return numbersMap.get(number);
    }

    private static String buildPharse(String... args) {
        StringBuilder sb = new StringBuilder(args[0]);

        for (int i = 1; i < args.length; i++) {
            sb.append(BLANK_SPACE);
            sb.append(args[i]);
        }

        return sb.toString();
    }
}
