package com.javalive.mostBasic.loopingstatements;

public class LablledContinueNewIMP {
	public static void main(String[] args) {
		out: for (int i = 1; i <= 5; i++) {
			System.out.println(i+" outer");
			for (int j = 1; j <= 5; j++) {
				System.out.println(j+" nested");
				if (j == 2) {
					// continue; this will skip second(j==2) iteration of inner for loop only
					continue out; // this will skip current iteration of both for loops
				}
			}
		}
	}
}
