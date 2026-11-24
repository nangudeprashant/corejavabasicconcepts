package com.javalive.mostBasic.firstWeek.day1;

/*
 * Type of Java Statements
Java supports five different types of statements:

Blocks: Blocks are denoted by open and close curly braces.

Empty Statements: The empty statement, represented by a semicolon(;) and nothing else, does nothing.

Declaration statements :
Java declaration statements are one kind of statement, where declare a variable with specifying it’s 
data type and name.A variable is named container (identifier) that holds values used in a Java program.
A variable can be initialize with some value and can also have calculated values from expressions which 
can vary over time.

Expression statements:The expression statement in java is a one kind of statement that usually created 
to produce some new value. Expressions are built using values, variables, operators and method calls. 
Although, Sometimes an expression assigns a value to a variable .

Control flow statements: Determine the order that statements are executed. 
Statements in java source code generally executed from top to bottom, in the order they appear. 
However, with control-flow statements, that order can be interrupted to implement decision making,
branching or looping so that the Java program can run particular blocks of code based on certain 
conditions. Control flow statements categorize as below:
1>Decision-making statements: if-then, if-then-else, if-else-if, switch
2>Looping statements: for, while, do-while
3>Branching statements: break, continue, return
 */

public class TypesOfStatementsInJavaProgram {
	// starting of a block
	{
		// empty statement
		;
		//declaration statement
		int age;
		age=25;
		//control flow statement
		if(age<18) {
			System.out.println("Not eligible for voting.");
		}else {
			System.out.println("Eligible for voting.");
		}
	}//ending of block
	
	public static void main(String[] args) {
		TypesOfStatementsInJavaProgram obj=new TypesOfStatementsInJavaProgram();
	}
}
