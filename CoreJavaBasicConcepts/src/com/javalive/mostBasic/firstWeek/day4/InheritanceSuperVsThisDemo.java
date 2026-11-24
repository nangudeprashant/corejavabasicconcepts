package com.javalive.mostBasic.firstWeek.day4;

/*
 * These two keywords basically used during inheritance to access variables and methods of base class and
 * derived class respectively. 
 */


class Animal1 {

	// overridden method
	public void display() {
		System.out.println("I am an animal");
	}

}

class Dog1 extends Animal1 {
    private int num1;
    private int num2;
	// overriding method
	@Override
	public void display() {
		System.out.println("I am a dog");
	}

	public void printMessage() {
        //using this to access method of a class
		this.display();// this calls overriding method i.e. method from this class viz. Dog1

		super.display();//this calls display() method from the super class i.e. Animal1 in this case.
	}
	
	public void add(int a, int b) {
		this.num1=a;//using this to access and set instance variables of the class (viz. Dog1 in this case)
		this.num2=b;
		System.out.println("Addition of the two numbers is "+(this.num1+this.num2));
	}
}

public class InheritanceSuperVsThisDemo {
	public static void main(String[] args) {
		Dog1 dog1 = new Dog1();
		dog1.printMessage();
		dog1.add(10, 20);
	}
}
