package com.javalive.mostBasic.loopingstatements;

public class UsingReturnInLoopDemo {
	public void displayNum(){
		int i=10;
		while(i>=1){
			System.out.println("Hello world");
			i--;
			if (i==5) {
				return;//return directly comes out of the method.
			}
		}
		System.out.println("Hi there! Are you looking for me?");
	}
public static void main(String[] args) {
	UsingReturnInLoopDemo obj=new UsingReturnInLoopDemo();
	obj.displayNum();
}
}
