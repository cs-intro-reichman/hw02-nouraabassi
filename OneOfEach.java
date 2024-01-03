/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here

		
        boolean hasBoy = false;
        boolean hasGirl = false;
        int childrenCount = 0;

        // Keep simulating until there is at least one boy and one girl
        while (!hasBoy || !hasGirl) {
            if (Math.random() < 0.5) {
                System.out.print("b ");
                hasBoy = true;
            } else {
                System.out.print("g ");
                hasGirl = true;
            }
            childrenCount++;
        }

        System.out.println("\nYou made it... and you now have " + childrenCount + " children.");
    }
}
