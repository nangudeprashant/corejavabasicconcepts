package com.javalive.mostBasic.firstWeek.day8;

class A {
	public Number m1(int a, double b) {
		System.out.println("Hello, this is a superclass");
		return null;
	}
}

class B extends A {
	@Override
	public Integer m1(int a, double b) {
		System.out.println("Hello, this is the subclass");
		return null;
	}
}

class X {
	public double m1(char c) {
		System.out.println("m1-X");
		return 25;
	}
}

/*class Y extends X {
	@Override
	public Integer m1(char c) // Error because the return type is incompatible with X.m1(char). Covariant
								// return type concept is applicable only for an object reference type, not for
								// primitive types because there is no subtype relationship between primitive
								// types.
	{
		System.out.println("m1-Y");
		return 20;
	}
}*/

public class CovariantReturnTypeDemo {
	public static void main(String[] args) {
		A a = new B();
		a.m1(10, 20.5);
	}
}
