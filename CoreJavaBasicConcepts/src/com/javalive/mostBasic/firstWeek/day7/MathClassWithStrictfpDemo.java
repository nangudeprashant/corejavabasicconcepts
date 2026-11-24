package com.javalive.mostBasic.firstWeek.day7;

/**
 * @author JavaLive.com description Java Math class provides several methods to
 *         work on math calculations like min(), max(), avg(), sin(), cos(),
 *         tan(), round(), ceil(), floor(), abs() etc.
 * 
 *         Unlike some of the StrictMath class numeric methods, all
 *         implementations of the equivalent function of Math class can't define
 *         to return the bit-for-bit same results. This relaxation permits
 *         implementation with better-performance where strict reproducibility
 *         is not required.
 * 
 *         If the size is int or long and the results overflow the range of
 *         value, the methods addExact(), subtractExact(), multiplyExact(), and
 *         toIntExact() throw an ArithmeticException.
 * 
 *         For other arithmetic operations like increment, decrement, divide,
 *         absolute value, and negation overflow occur only with a specific
 *         minimum or maximum value. It should be checked against the maximum
 *         and minimum value as appropriate.
 * 
 *         What is strictfp in Java? 
 *         java strictfp keyword is modifier. strictfp
 *         used to restricting floating-point and round of precision
 *         calculations (float and double) and ensuring same result on every
 *         platform while performing operations with floating point variable.
 * 
 *         Why strictfp in java? 
 *         In java floating point calculations are
 *         platform dependent i.e. different precision output(floating point
 *         values) is achieved when a class file is run on different
 *         platforms(16/32/64 bit processors).
 * 
 *         To solve such issues strictfp keyword was introduced in java 1.2 and
 *         later version by following IEEE 754 standards for floating-point
 *         calculations.
 * 
 *         Where can we use strictfp? Below are cases where strictfp use:
 * 
 *         Allowed:
 *         strictfp modifier is used with classes, interfaces and methods only.
 *         When a class or an interface is declared with strictfp modifier, then
 *         all methods declared in the class/interface, and all nested types
 *         declared in the class, are implicitly follow strictfp. 
 *         
 *         Not Allowed
 *         strictfp cannot be used with abstract methods. However, it can be
 *         used with abstract classes/interfaces. strictfp cannot be used with
 *         any method inside an interface because methods of an interface are
 *         implicitly abstract.
 *         
 *         Now uncomment and comment first and second line in below program and vice 
 *         versa and observe the output on various OSs.
 *         
 */
// public strictfp class MathClassWithStrictfpDemo {
public class MathClassWithStrictfpDemo {
	public static void main(String[] args) {
		double x = 28;
		double y = 4;

		// return the maximum of two numbers
		System.out.println("Maximum number of x and y is: " + Math.max(x, y));

		// return the square root of y
		System.out.println("Square root of y is: " + Math.sqrt(y));

		// returns 28 power of 4 i.e. 28*28*28*28
		System.out.println("Power of x and y is: " + Math.pow(x, y));

		// return the logarithm of given value
		System.out.println("Logarithm of x is: " + Math.log(x));
		System.out.println("Logarithm of y is: " + Math.log(y));

		// return the logarithm of given value when base is 10
		System.out.println("log10 of x is: " + Math.log10(x));
		System.out.println("log10 of y is: " + Math.log10(y));

		// return the log of x + 1
		System.out.println("log1p of x is: " + Math.log1p(x));

		// return a power of 2
		System.out.println("exp of a is: " + Math.exp(x));

		// return (a power of 2)-1
		System.out.println("expm1 of a is: " + Math.expm1(x));
	}
}
