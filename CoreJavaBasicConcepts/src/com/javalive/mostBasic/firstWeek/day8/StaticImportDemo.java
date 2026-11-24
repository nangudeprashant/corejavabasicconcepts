package com.javalive.mostBasic.firstWeek.day8;

import static java.lang.Math.*;//IMP:- here we have imported static classes viz. Math and System
import static java.lang.System.*;//Now in the second class defined below, we have use these import
									//Study the difference between calling methods of these two classes  
									//viz. Math and System in following examples.

/*
 * With the help of static import, we can access the static members of a class directly without 
 * class name or any object. For Example: we always use sqrt() method of Math class by using 
 * Math class i.e. Math.sqrt(), but by using static import we can access sqrt() method directly. 
 */

//Java Program to illustrate
//calling of predefined methods
//without static import
class MethodCallsWithoutStaticImport {
	public void methodCallWithoutStaticImport() {
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 2));
		System.out.println(Math.abs(6.3));
	}
}

// Java to illustrate calling of static member of
// System class without Class name
class MethodCallsWithStaticImport {
	public void methodCallWithStaticImport() {
		out.println(sqrt(4));//here instead of System.out.println we have simply used out.println as we have imported System class statically
		out.println(pow(2, 2));//similarly instead of Math.pow we have simply used pow as we have imported Math class statically
		out.println(abs(6.3));
	}
}

public class StaticImportDemo {
	public static void main(String[] args) {
		System.out.println("Method calls without static import.......");
		MethodCallsWithoutStaticImport obj1 = new MethodCallsWithoutStaticImport();
		obj1.methodCallWithoutStaticImport();
		System.out.println("Method calls with static import.....");
		MethodCallsWithStaticImport obj2 = new MethodCallsWithStaticImport();
		obj2.methodCallWithStaticImport();
	}
}

/*
 * Difference between import and static import:
 * 
 * With the help of import, we are able to access classes and interfaces which
 * are present in any package. But using static import, we can access all the
 * static members (variables and methods) of a class directly without explicitly
 * calling class name. The main difference is Readability, ClassName.dataMember
 * (System.out) is less readable when compared to dataMember(out), static import
 * can make your program more readable
 */
