/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
       

        int x = Integer.parseInt(args[0]);

        int s = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                s += i;
            }
        }

        if (s == x) {
            System.out.print(x + " is a perfect number since " + x + " = 1");

            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.print(" + " + i);
                }
            }
            System.out.println();
        } else {
            System.out.println(x + " is not a perfect number");
        }
    }
}
