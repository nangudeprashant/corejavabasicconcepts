package com.javalive.mostBasic.firstWeek.day8;

class First {
	public void displayFrist() {
		System.out.println("Method displayFirst() statement 1");
		System.out.println("Method displayFirst() statement 2");
		System.out.println("Method displayFirst() statement 3");
		System.out.println("Method displayFirst() statement 4");
		System.out.println("Method displayFirst() statement 5");
		System.out.println("Method displayFirst() statement 6");
	}
}

class Second {
	public void displaySecond() {
		System.out.println("Method displaySecond() statement 1");
		System.out.println("Method displaySecond() statement 2");
		System.out.println("Method displaySecond() statement 3");
		System.out.println("Method displaySecond() statement 4");
		System.out.println("Method displaySecond() statement 5");
		System.out.println("Calling First class's method>>>>>>>>>");
		First firstObj=new First();
		firstObj.displayFrist();
		System.out.println(">>>>>>Returning in Second class's method from First classs's method.");
		System.out.println("Method displaySecond() statement 6");
	}
}

class Third {
	public void displayThird() {
		System.out.println("Method displayThird() statement 1");
		System.out.println("Calling Second class's method>>>>>>>>");
		Second secondObj=new Second();
		secondObj.displaySecond();
		System.out.println(">>>>>>>>>>Returning in Third class's method from Second classs's method.");
		System.out.println("Method displayThird() statement 2");
		System.out.println("Method displayThird() statement 3");
		System.out.println("Method displayThird() statement 4");
		System.out.println("Method displayThird() statement 5");
		System.out.println("Method displayThird() statement 6");
	}
}

public class MethodCallStackDemo {
	public static void main(String[] args) {
		Third thirdObj=new Third();
		thirdObj.displayThird();
	}
}
