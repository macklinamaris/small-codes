package discreteFP_1_Amacklin;

import discreteFP_1_Amacklin.Encrypt_SC;

import java.util.Scanner; // import input utility


public class Fp_ShiftCipher_AM {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // create scanner "input"
	
		
		while (true) {
			
			System.out.println();
			System.out.println();
			System.out.println("Please enter the NUMBRER corresponding to the option you choose");
			System.out.println();
			System.out.println("1. Encypt message");//Encrypt option
			System.out.println();
			System.out.println("2. Decrpyt message");// Decrypt option
			System.out.println();
			System.out.println("3. Exit Program");// exit option
			System.out.println();
			
			System.out.print("Enter option number: ");
			int choice = input.nextInt();
			
			
			if (choice >=1 && choice <=3) {
				
				if (choice == 1) {
					
					System.out.println();
					System.out.println("Encrypting the message");
					
					
					
				 
				 Encrypt_SC encrpyt = new Encrypt_SC();
				 Encrypt_SC.main(new String[0]); // call main method
					
					
				}
				
				else if (choice == 2) {
					
					System.out.println();
					System.out.println("Decrypting the message");
					
					Decrypt_SC decrpyt = new Decrypt_SC();
					Decrypt_SC.main(new String[0]);// call main method
					
					
					
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
