package com.hackerrank.contests.hourrank5;

import java.util.Scanner;

public class AnnAndJimmy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int a = n /3;
        int b = (n - a) / 2;
        int c = b;
        		
        if ((n - a) % 2 != 0 ) {
        	 c = n - a - b;
        }
        
        System.out.println(a * b * c);
	}
}
