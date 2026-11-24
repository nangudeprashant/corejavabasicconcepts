package com.javalive.mostBasic.firstWeek.day8;

/*
 * In java, arguments are always passed by value regardless of the original variable type. 
 * Each time a method is invoked, the following happens:
 * A copy for each argument is created in the stack memory and the copy version is passed to the method.
 * If the original variable type is primitive, then simply, a copy of the variable is created inside the stack memory and then passed to the method.
 * If the original type is not primitive, then a new reference or pointer is created inside the stack memory which points to the actual object data and the new reference is then passed to the method, (at this stage, 2 references are pointing to the same object data).
 */
public class PassByValueAndPassByReferenceDemo {
	void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
	}

	void modifyWrappers(Integer x, Integer y) {
		x = new Integer(5);
		y = new Integer(10);
	}
	
	public static void main(String[] args) {
		PassByValueAndPassByReferenceDemo obj=new PassByValueAndPassByReferenceDemo();
		
		System.out.println("========passing primitive types======");
		int x = 1;
        int y = 2;
        System.out.print("Values of x & y before primitive modification: ");
        System.out.println(" x = " + x + " ; y = " + y );
        
        obj.modifyPrimitiveTypes(x, y);
        
        System.out.print("Values of x & y after primitive modification: ");
        System.out.println(" x = " + x + " ; y = " + y );
        
        System.out.println("========passing object types======");
        Integer obj1 = new Integer(1);
        Integer obj2 = new Integer(2);
        System.out.print("Values of obj1 & obj2 before wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
        
        obj.modifyWrappers(obj1, obj2);
        
        System.out.print("Values of obj1 & obj2 after wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
	}
}
