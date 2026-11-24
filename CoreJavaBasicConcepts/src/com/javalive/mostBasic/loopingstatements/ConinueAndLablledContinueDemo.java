package com.javalive.mostBasic.loopingstatements;

/*
The continue statement, when used in association with loops in Java,
 skips the remaining statements in the loop body and proceeds to the 
 next iteration of the loop. This is in contrast to the break statements,
 where it escapes from the immediate loop. The continue statement simple 
 resumes the loop beginning with the next iteration.
*/

class SimpleContinueDemo {

	public void simpleContinue() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;// this logic skips loop for odd numbers and displays only even numbers in the
							// loop.
			} else {
				System.out.println(i);
			}
		}
	}
}

/*
 * The labeled continue statement is similar to the unlabeled continue statement
 * in the sense that both resume the iteration. The difference with the labeled
 * continue statement is that it resumes operation from the target label defined
 * in the code. As soon as the labeled continue is encountered, it skips the
 * remaining statements from the statement’s body and any number of enclosing
 * loops and jumps to the nest iteration of the enclosing labeled loop
 * statements. Here is an example to illustrate the labeled continue statement.
 */

class LabeledContinueDemo {

	public void lablledContinue() {

		start: for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print("#");
				if (j >= i)
					continue start;
			}
			System.out.println("This will never" + " be printed");
		}
	}
}

/*
 * The for loop has been started with a label. When the continue statement is
 * executed, it jumps to the target label start: and begins the iteration
 * afresh. And, other statements after the continue operation are simply
 * skipped. This is the reason the third System.out.println(…) will never get a
 * chance to execute.
 * Test above program with debugging at start words line.
 */
public class ConinueAndLablledContinueDemo {
	public static void main(String[] args) {
		SimpleContinueDemo simpleContinueObj = new SimpleContinueDemo();
		simpleContinueObj.simpleContinue();
		
		LabeledContinueDemo lablledContinueDemo=new LabeledContinueDemo();
		lablledContinueDemo.lablledContinue();
	}
}
/*
 * The labeled break and labeled continue statements are the only way to write
 * statements similar to goto. Java does not support goto statements. It is good
 * programming practice to use fewer or no break and continue statements in
 * program code to leverage readability. It is almost always possible to design
 * program logic in a manner never to use break and continue statements. Too
 * many labels of nested controls can be difficult to read. Therefore, it is
 * always better to avoid such code unless there is no other way.
 */
