package com.javalive.mostBasic.firstWeek.day8;

/*
 * In this program, you will learn about to execute a Java Program from Eclipse and Commandline. 

Points to Remember
These are some points that need keep in mind while passing arguments from the eclipse or command line.

When you need to pass more than one argument. These values separated by spaces.
If passing an argument String value having space make sure to pass in the double quote (” “). For Example: “Joe Biden”.
Always check for the length of  main() method argument otherwise you may get ArrayIndexOutOfBoundException if trying to access index beyond passed arguments.
 */
public class CommandLineArgumentsDemo {
	public static void main(String[] args) {
			System.out.println("Number of Command Line Argument = "+args.length);
			
			for(int i = 0; i< args.length; i++) {
				System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
			}
		}
}
/*
 * Steps to execute above programs are as follows: 
 * Step 1: Right-click on the file select option as “Run As” -> “Run Configuration”. 
 * Step 2: You will get pop up, Go to the “Arguments” tab pass arguments in the “Program Arguments”
 *         section as mentioned in the below screen for this example. 
 * Step 3:Click on the Run Button. 
 * Step 4: You will see the output in the console tab.
 */