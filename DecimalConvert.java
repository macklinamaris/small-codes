
import java.util.Scanner;

public class DecimalConvert {

	public static void main(String[] args) {
		
		
		
Scanner input = new Scanner(System.in); // create scanner
		
		System.out.println();
		System.out.print("please enter a decimal number for binary conversion: ");
		
		int decNum = input.nextInt(); // grab binary number from user
		int binNum = 0;// intialie binary number
		int decPlace = 1;	// intializee the decimal place	
		
		
		while (decNum > 0) {
			
			int Rmain = decNum % 2; // get the remainder from dividing by 2
			
			binNum += Rmain * decPlace; //add the remainder to the binary number
			
			decPlace *= 10; // shift the decimal place
			
			decNum = decNum / 2; // update decNum for next loop
			
			
			
		}
		
		System.out.println();
		System.out.println("binary equivalent: " + binNum);
		
		
		
		
	}
			
		
	

}
 