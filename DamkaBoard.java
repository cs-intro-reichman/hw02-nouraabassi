/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here

	int n = Integer.parseInt(args[0]);

         for (int i = 0; i < n; i++) {
            for (int f = 0; f < n; f++) {
                // Check the sum of the indices to determine whether to print an asterisk or space
                if ((i + f) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

	}
}

