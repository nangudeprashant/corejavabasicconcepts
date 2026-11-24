package com.javalive.mostBasic.firstWeek.day7;

import java.io.Serializable;

//Cloneable and Serializable is marker interface

public class ClassForObjectCreation implements Cloneable, Serializable {
	public int x = 5;

	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is " + fact);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}