package com.javalive.mostBasic.firstWeek.day4;

abstract class Animal {
	abstract void makeSound();//This is subclass specific method hence abstract.

	public void eat() {//This is the common method which is applicable to all subclasses of the animals
		               //hence we have provided its implementation here.  
		System.out.println("I can eat.");
	}
}

class Dog extends Animal {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Cat extends Animal {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Miau miau");
	}
}

public class InheritanceWithAbstractClass {
	public static void main(String[] args) {

		// create an object of Dog class
		Dog d1 = new Dog();
		d1.makeSound();
		d1.eat();
		
		// create an object of Dog class
		Cat c1 = new Cat();
		c1.makeSound();
		c1.eat();
	}

}
