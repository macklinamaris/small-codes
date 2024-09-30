
import java.util.Scanner; // import scanner
public class MainPage {
	
	
public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);// create scanner
		
		while (true) { 
		
		System.out.println();
		System.out.println();
		System.out.println("Please Enter the NUMBER corresponding to the option you choose");
		
		System.out.println();
		System.out.println("1. Binary to Decimal");//converts binary to decimal
		System.out.println();
		System.out.println("2. Decimal to Binary");// converts decimal to binary
		System.out.println();
		System.out.println("3. Exit Program");// exit option
		System.out.println();
		
		System.out.print("Enter option number: ");
		int choice = input.nextInt();
		
		
		if (choice >=1 && choice <=3) {
			
			if (choice == 1) {
				
				System.out.println();
				System.out.println("You have begun binary to decimal conversion");
				
				
				
			 
			 BinaryConvert Bin2Dec = new BinaryConvert();
			 BinaryConvert.main(new String[0]); // call main method
				
				
			}
			
			else if (choice == 2) {
				
				System.out.println();
				System.out.println("You have begun decimal to binary conversion");
				
				DecimalConvert Dec2Bin = new DecimalConvert();
				DecimalConvert.main(new String[0]);// call main method
				
				
				
				}
			
			else if (choice == 3) {
				
				System.out.println();
				System.out.println("Now quitting the program");
				
				break;
			}
			
		}
		
		
	 }


}
		


}
