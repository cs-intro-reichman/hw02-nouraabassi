public class Reverse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        String k = args[0];
        int length = k.length();

        // Reversing the string
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(k.charAt(i));
        }

        // Finding the middle character
        if (length % 2 != 0) {
            System.out.println("\nThe middle character is " + k.charAt(length / 2));
        } else {
            int mid = length / 2;
            System.out.println("\nThe middle characters are " + k.charAt(mid - 1) + " and " + k.charAt(mid));
        }
    }
}
