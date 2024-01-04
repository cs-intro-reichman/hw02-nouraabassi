public class InOrder {
    public static void main(String[] args) {
        int first = (int) (Math.random() * 10); 
        int n = -1; 
        while (first >= n) {
            System.out.print(first + " ");
            n = first;
            first = (int) (Math.random() * 10); 
        }
    }
}
