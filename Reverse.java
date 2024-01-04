
/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */


public class Reverse {
    public static void main(String[] args) {
      

        String k = args[0];
        int length = k.length();


        for (int i = length - 1; i >= 0; i--) {
            System.out.print(k.charAt(i));
        }

       
       if (length % 2 != 0) {
            System.out.println("\nThe middle character is " + k.charAt(length / 2));
        } 
        /* if (length % 2 != 0){
            int mid = length / 2;
            System.out.println("\nThe middle characters are " + k.charAt(mid - 1) + " and " + k.charAt(mid));
        }*/
        
    }
}
