package com.javalive.mostBasic.firstWeek.day3;

enum Size {//declaration of enumeration data type 
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
	Size pizzaSize;

	public Test(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	//Following code is using the enum values in actual business logic.
	public void orderPizza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza.");
			break;
		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
}

public class JavaEnumerationDemo {
	public static void main(String[] args) {
		System.out.println(Size.SMALL);//Simply displaying the enum values directly in the statement.
		System.out.println(Size.MEDIUM);

		 
		Test t1 = new Test(Size.MEDIUM);
		t1.orderPizza();
	}
}
