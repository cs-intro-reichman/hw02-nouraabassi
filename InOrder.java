/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	
  public static void main (String[] args) {
		//// Write your code here
		int k = (int) (Math.random() * 10);
   
        System.out.print(k+" ");
        int n;
         n = (int) (Math.random() * 10);
   do{
         
    
   
            //if (n>=k) {
                System.out.print(n+" ");
              k = n;
            //}
            } 
            while (n>=k);
		
          

  
        }
  }
