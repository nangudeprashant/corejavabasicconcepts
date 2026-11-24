package com.javalive.mostBasic.firstWeek.day2;

public class TyesOfVariablesDemo {
	private int instanceVariable;// this is an instance variable which is as name suggests, object/instance
									// specific.
									// we need not to be initialize them during their declaration as they get
									// respective default value as per their data type.

	public void displayLoop() {// here j and i are local variables
		int j = 5;
		System.out.println("Displaying values of one of thee local variable i through loop.");
		for (int i = 1; i <= j; i++) { // local variables are those which are used in loops, blocks, constructors and
										// methods.
			System.out.println(i); // Remember we have to initialize them at the time of their declaration only.
		}
		System.out.println("Displaying the instance variable of the class " + this.instanceVariable);
	}

	public static void main(String[] args) {//following line demonstrates declaration of reference variable  
		TyesOfVariablesDemo referenceVariable = new TyesOfVariablesDemo();
		referenceVariable.displayLoop();
		System.out.println("Please note that this variable initialized to its default value automatically. \n"
				+ "Unlike local variables where we have to initialize them explicitly.");
	}
}
