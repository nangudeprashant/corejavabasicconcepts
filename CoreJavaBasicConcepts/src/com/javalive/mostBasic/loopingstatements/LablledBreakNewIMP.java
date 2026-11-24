package com.javalive.mostBasic.loopingstatements;

public class LablledBreakNewIMP {
	public static void main(String[] args) {
		out: for (int i = 1; i <= 10; i++) {
			System.out.println(i+" outer");
			for (int j = 1; j <= 10; j++) {
				System.out.println(j+" nested");
				if (j == 2) {
					 //break; //this will exit from inner for loop only
					break out; // this will exit from both for loops
				}
			}
		}
	}
}