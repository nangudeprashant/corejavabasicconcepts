package com.javalive.mostBasic.firstWeek.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * In java objects can be created by five ways as follows:
	1.Object Creation by new
	2.Object Creation by reflection Class.newInstance() method.
	3.Object Creation by clone() method
	4.Object creation by the Annonymous Object.
	5.Object Creation by  Deserialization
 */


public class JavaObjectCreationWays {
	public static void main(String[] args) {
		System.out.println("Object Creation by New");
		// Object Creation by using New
		ClassForObjectCreation cal = new ClassForObjectCreation();
		cal.fact(3);

		System.out.println("\nObject Creation by Reflection");
		// Object creation by newInstance method by reflection
		try {
			Class calculationClass = Class.forName("com.javalive.mostBasic.firstWeek.day7.ClassForObjectCreation");
			ClassForObjectCreation calc = (ClassForObjectCreation)calculationClass.newInstance();
			calc.fact(5);
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
			ex.printStackTrace();
			// Multiple exception in single catch example in java 7
		}

		System.out.println("\nObject Creation by Clone");
		/**
		 * Object creation by clone
		 */
		try {
			System.out.println(cal.x);
			ClassForObjectCreation cal2 = (ClassForObjectCreation) cal.clone();
			System.out.println(cal2.x);
			cal.x = 10;
			// No change on clone object
			System.out.println(cal2.x);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		System.out.println("\nObject Creation by Annonymous");
		/**
		 * Annonymous simply means nameless.An object that have no reference is known as
		 * annonymous object. If you have to use an object only once, annonymous object
		 * is a good approach.
		 */
		// calling method with annonymous object
		new ClassForObjectCreation().fact(5);

		System.out.println("\nObject Creation by  Deserialization");
		// By using deserialization of serialize object

		searializeObject(); // method to serialization of calculation object

		// By deserialization create object of Calculation Object

		ClassForObjectCreation c = deserializationOfObject();
		c.fact(5);

	}

	// serialize from java object to Object Stream
	public static void searializeObject() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("calculator.ser");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			ClassForObjectCreation c = new ClassForObjectCreation();
			c.x = 12;
			// serialization of object
			objectOutputStream.writeObject(c);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// deserialization of objectStream to Java object
	public static ClassForObjectCreation deserializationOfObject() {

		ClassForObjectCreation c = null;

		try {
			FileInputStream fileInputStream = new FileInputStream("calculator.ser");

			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			c = (ClassForObjectCreation) objectInputStream.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return c;
	}
}
