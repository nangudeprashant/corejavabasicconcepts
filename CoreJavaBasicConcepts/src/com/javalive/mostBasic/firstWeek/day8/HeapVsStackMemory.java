package com.javalive.mostBasic.firstWeek.day8;

/*
 * Difference between Java Heap Space and Stack Memory

Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.
Whenever an object is created, it’s always stored in the Heap space and stack memory contains the reference to it. 
Stack memory only contains local primitive variables and reference variables to objects in heap space.
Objects stored in the heap are globally accessible whereas stack memory can’t be accessed by other threads.
Memory management in stack is done in LIFO manner whereas it’s more complex in Heap memory because it’s used globally. 
Heap memory is divided into Young-Generation, Old-Generation etc, more details at Java Garbage Collection.
Stack memory is short-lived whereas heap memory lives from the start till the end of application execution.
We can use -Xms and -Xmx JVM option to define the startup size and maximum size of heap memory. We can use -Xss to define the stack memory size.
When stack memory is full, Java runtime throws java.lang.StackOverFlowError whereas if heap memory is full, it throws java.lang.OutOfMemoryError:Java Heap Space error.
Stack memory size is very less when compared to Heap memory. Because of simplicity in memory allocation (LIFO), 
stack memory is very fast when compared to heap memory.
 */
public class HeapVsStackMemory {

	public static void main(String[] args) { // Line 1
		int i = 1; // Line 2
		Object obj = new Object(); // Line 3
		HeapVsStackMemory mem = new HeapVsStackMemory(); // Line 4
		mem.foo(obj); // Line 5
	} // Line 9

	private void foo(Object param) { // Line 6
		String str = param.toString(); //// Line 7
		System.out.println(str);
	} // Line 8

}
/*
 * Explanation of above program line by line Let’s go through the steps of the
 * execution of the program.
 * 
 * As soon as we run the program, it loads all the Runtime classes into the Heap
 * space. When the main() method is found at line 1, Java Runtime creates stack
 * memory to be used by main() method thread. We are creating primitive local
 * variable at line 2, so it’s created and stored in the stack memory of main()
 * method. Since we are creating an Object in the 3rd line, it’s created in heap
 * memory and stack memory contains the reference for it. A similar process
 * occurs when we create Memory object in the 4th line. Now when we call the
 * foo() method in the 5th line, a block in the top of the stack is created to
 * be used by the foo() method. Since Java is pass-by-value, a new reference to
 * Object is created in the foo() stack block in the 6th line. A string is
 * created in the 7th line, it goes in the String Pool in the heap space and a
 * reference is created in the foo() stack space for it. foo() method is
 * terminated in the 8th line, at this time memory block allocated for foo() in
 * stack becomes free. In line 9, main() method terminates and the stack memory
 * created for main() method is destroyed. Also, the program ends at this line,
 * hence Java Runtime frees all the memory and ends the execution of the
 * program.
 */
