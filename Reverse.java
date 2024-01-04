
/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
  //Scanner m=new Scanner(System.in);
  //String k = m.nextLine();

	String k;
	k=args[0];
	//k = m.nextLine();
 
	//System.out.println();
	 
	int length =k.length();
	int f=length ;
	  
	char first=k.charAt(0);
	char last=k.charAt(length - 1);
	   
	 //  System.out.println(s.charAt(s.length() - 1)); // 'a'
while (first!=last && length>0){
	
	 System.out.print(k.charAt(length - 1));
	 length --;
}


 System.out.print('\n'+"The middle character is "+k.charAt(f/2));

 
	}

}
