package com.javalive.mostBasic.firstWeek.day2;

/*Main method is launcher method acts as an entry point for the JVM to start 
 * execution of a program. JVM always looks the main() method signature to 
 * launch the program. Below are different variation of main() method that are valid in Java.*/

//================================================================================
//Type 1:Default Prototype: This most  preferred way to write main() method in Java.

/*public class FlavoursofMainMethod {
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}*/
/*Meaning of the main Syntax above:
main(): This is launcher method configured in the JVM to initiate execution of a program.
String[]: These are parameters passed as command line arguments.
public: This keyword is access modifier to define scope of a method. For JVM can execute the method from anywhere.
static: This keyword is Non access modifier use to show part of a class.Here use with Main method so that called by JVM without any object.
void: The main method doesn’t return anything. void keyword use to as part of method signature if there is no return type.
*/

//===============================================================================

//Type 2:Order of Modifiers: We can swap position of modifiers (static and public) in main method.
/*public class FlavoursofMainMethod {
	static public void main(String[] args) {
		System.out.println("Main Method");
	}
}*/

// ==============================================================================

// Type 3: Variants of String Array Arguments: We can place square brackets at
// different positions
// or use varargs (…) for arguments in main method.
// Arguments Array Declaration (Way 1):
/*public class FlavoursofMainMethod {
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}*/

// Arguments Array Declaration (Way 2):

public class FlavoursofMainMethod {
	public static void main(String args[]) {
		System.out.println("Main Method");
	}
}
