package com.javalive.mostBasic.firstWeek.day1;

public class StructureofJavaProgram {//declaration of a class
	private int num1;//declaration of instance variables
	private int num2;//

	public void setNum1(int num1) {//setter method for instance variable num1
		this.num1 = num1;
	}

	public void setNum2(int num2) {//setter method for instance variable num2
		this.num2 = num2;
	}

	public int getNum1() {//getter method for instance variable num1
		return num1;
	}
	
	public int getNum2() {//getter method for instance variable num2
		return num2;
	}
	
	public int addition() {//instance method for addition of two numbers
		return num1+num2;
	}
	public static void main(String[] args) {//main method
		StructureofJavaProgram obj=new StructureofJavaProgram();//creation of object of the class
		obj.setNum1(10);//accessing setter method of the class and setting the value for num1.
		obj.setNum2(20);//accessing setter method of the class and setting the value for num2.
		int result=obj.addition();//declaring a local variable in main method and storing the value of addition of
		                          //the two numbers in it by calling instance method addition() of the class.
		System.out.println("Result is "+result);
	}
}
