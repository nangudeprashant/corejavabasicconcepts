package com.javalive.mostBasic.firstWeek.day8;


/**
 * @author www.itaspirants.com
 */
public class MemoryMgntAndGarbageCollectionDemo {
	 public static void main(String args[]){  
	        /* Here we are intentionally assigning a null 
	         * value to a reference so that the object becomes
	         * non reachable
	         */
		 MemoryMgntAndGarbageCollectionDemo obj=new MemoryMgntAndGarbageCollectionDemo();  
		 obj=null;  
	        /* Here we are intentionally assigning reference a 
	         * to the another reference b to make the object referenced
	         * by b unusable.
	         */
		MemoryMgntAndGarbageCollectionDemo a = new MemoryMgntAndGarbageCollectionDemo();
		MemoryMgntAndGarbageCollectionDemo b = new MemoryMgntAndGarbageCollectionDemo();
		b = a;
		System.gc();  
		System.out.println("Garbage collection is performed by JVM");
	   }  
	   protected void finalize() throws Throwable
	   {
		   System.out.println("finalize method called");    
	   }
}
