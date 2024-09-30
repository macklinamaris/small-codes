
import java.util.Scanner; // import scanner

public class BinaryConvert {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); // create scanner
		
		System.out.println();
		System.out.print("please enter a binary number for decimal conversion: ");
		
		String binNum = input.nextLine();// grab binary number from user
		
		int decEquiv = 0; // intialize decEquiv variable
		
		
	
		
		
		for (int i = binNum.length() - 1; i>=0; i--)  {// check if number is binary
			
			char bit = binNum.charAt(i);
			
			
			if (bit != '0' && bit != '1') {
				
				System.out.println("Not a binary number");
				
				break;
				
			}else {
				
				
				decEquiv += (bit -'0') * Math.pow(2, binNum.length() - 1 - i); // equation for conversion
				
				
				
			}	
			
				
		}
		
	
		System.out.println();
		System.out.println("the decimal equivalent is: " + decEquiv);

}

}
	
	
	
	




