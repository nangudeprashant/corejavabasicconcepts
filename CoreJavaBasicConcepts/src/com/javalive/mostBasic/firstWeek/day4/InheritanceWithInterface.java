package com.javalive.mostBasic.firstWeek.day4;

/*
 * Author: www.itaspirants.com
 */

//Please refer interface notes for more details.

interface Shape {
	void draw();
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("This is implementation of draw() method of Shape interface by Circle class.");
	}

	public void ownMethodofCircleClass() {
		System.out.println("Own method of Circle class.");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("This is implementation of draw() method of Shape interface by Square class.");
	}

	public void ownMethodofSquareClass() {
		System.out.println("Own method of Square class.");
	}

}

public class InheritanceWithInterface {
	public static void main(String[] args) {
		// Way 1
		// Here we have created reference variable of type Shape (interface) and assign
		// object of class Circle to it.
		// **This approach is useful for inter i.e. between applications business logic.
		// Note that here we can access only interface specific methods and methods
		// which are additionally
		// defined in the class (viz.ownMethodofCircleClass() in this case) is not
		// available to shapeCircle.
		Shape shapeCircle = new Circle();
		shapeCircle.draw();// valid
		// shapeCircle.ownMethodofCircleClass();//create compile time error.

		// Way 2
		// Create direct object of the class implementing the interface
		// **This approach is useful for intra i.e. within application business logic.
		// Note that here we can access all methods of this class i.e. the interface
		// specific methods and methods which are additionally
		// defined in the class (viz.ownMethodofSquareClass() in this case) are
		// available to shapeSquare.

		Square shapeSquare = new Square();
		shapeSquare.draw();
		shapeSquare.ownMethodofSquareClass();
	}

}
