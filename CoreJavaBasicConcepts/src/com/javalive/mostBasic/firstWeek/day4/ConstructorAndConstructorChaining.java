package com.javalive.mostBasic.firstWeek.day4;

class BaseClass {
	int baseNum1;
	int baseNum2;

	public BaseClass(int baseNum1, int baseNum2) {
        this(); //constructor chaining in same class with this() keyword  
		System.out.println("In the parameterised constructor of base class.");
		this.baseNum1 = baseNum1;
		this.baseNum2 = baseNum2;
		System.out.println(this.baseNum1+"      "+this.baseNum2);
	}

	public BaseClass() {
		System.out.println("In the non-parameterised constructor of base class.");
	}
}

class DerivedClass extends BaseClass{
	int derivedNum1;
	int derivedNum2;

	public DerivedClass(int baseNum1, int baseNum2,int derivedNum1, int derivedNum2) {
		super(baseNum1,baseNum2);//constructor chaining in derived class with super() keyword
		System.out.println("In the parameterised constructor of derived class.");
		this.derivedNum1 = derivedNum1;
		this.derivedNum2 = derivedNum2;
		System.out.println(this.derivedNum1+"      "+this.derivedNum2);
	}

	public DerivedClass() {
		System.out.println("In the non-parameterised constructor of derived class.");
	}

}

public class ConstructorAndConstructorChaining {
public static void main(String[] args) {
	DerivedClass derivedObj=new DerivedClass(10,20,30,40);
}
}
