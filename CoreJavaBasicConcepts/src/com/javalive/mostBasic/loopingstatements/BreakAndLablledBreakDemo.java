package com.javalive.mostBasic.loopingstatements;

/*
Sometimes, it is a requirement of the program logic to exit from the entire 
nested control statement with just one statement rather than wait for it to 
complete the entire execution. This type of situation is particularly suitable 
for a labeled break statement. This statement enables one to break from the 
entire labeled block in one go. The program execution resumes from the first 
statement encountered after the enclosing labeled break statement. 
Let’s write a couple of simple programs, one with labeled break and one 
with a simple break, and observe the difference in output.

Here is a program with a simple break statement:
*/
class SimpleBreakDemo {

	public void simpleBreak() {

		int counter = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i == 5)
					break;
			}
			counter++;
		}
		System.out.println(counter);
	}
}

/*
 * Output: 11
 * 
 * Here is a program with a labeled break statement:
 */
class LabeledBreakDemo {

	public void lablledBreak() {
		int counter = 0;
		start: {
			for (int i = 0; i <= 10; i++) {
				for (int j = 0; j <= 10; j++) {
					if (i == 5)
						break start;
				}
				counter++;
			}
		}
		System.out.println(counter);
	}
}

// Output: 5

/*
Observe that, in the second program, there is a labeled block, called start: 
and the nested for-loops are enclosed within the block. When the labeled break 
statement is executed, it skips all the remaining operations from that point to 
the end of the enclosing labeled block and resumes execution thereafter.
*/
public class BreakAndLablledBreakDemo {
	public static void main(String[] args) {
		SimpleBreakDemo simpleBreakObj = new SimpleBreakDemo();
		simpleBreakObj.simpleBreak();

		LabeledBreakDemo lablledBreakObj = new LabeledBreakDemo();
		lablledBreakObj.lablledBreak();
	}
}
