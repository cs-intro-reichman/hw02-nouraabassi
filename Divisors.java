/*
#feedback
1. try to keep the indentation and lines in consistent locations so the code would be more readable for you when debugging.
*/

/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	
		//// Put your code here
	

public static void main (String[] args) {
	// Put your code here
			//Scanner keyboard = new Scanner(System.in);
		  
		
			int x = Integer.parseInt(args[0]);

			int i=1;
				while (i<=x){
					if (x%i==0) {System.out.println(i);
								
								
								}
								i++;
				}

}
	}
