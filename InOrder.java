/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
 public class InOrder {
  public static void main (String[] args) {
		//// Write your code here
		int first = (int) (Math.random() * (10-1));
    int n = 0;
    while (first > n) {
      System.out.print(first + " ");
      n = first;
      first = (int) (Math.random() * (10-1));
    }
    
  }
}

