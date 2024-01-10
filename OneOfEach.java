/*
#feedback
1. you code doesn’t handle a case where 0.5 = = Math.random();
2. try next time to write down edge case that might happen and then add it to the code
*/

/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */

/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		oneOfEach();
	}
	public static void oneOfEach() {
		String children = "";
		int numOfBoys = 0;
		int numOFGirls = 0;
		while (numOfBoys == 0 || numOFGirls == 0) {
			double f = Math.random();
			if (f < 0.5) {
				children += "b";
				numOfBoys++;
			}
			else{
				children += "g";
				numOFGirls++;
			}
			children += " ";
		}
		System.out.println(children);
		System.out.println("You made it. . . and you now have " + numOFGirls+numOfBoys + " children.");
	}
}
