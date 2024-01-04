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
