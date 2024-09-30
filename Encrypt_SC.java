package discreteFP_1_Amacklin;


import java.util.Scanner; // import input utility

public class Encrypt_SC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // create scanner "input"
		
		System.out.println();
		System.out.println("Please enter the message you want encrypted (no numbers)");
		
	 String message = input.nextLine().toLowerCase(); //take message from user convert to lowercase
		
	 System.out.println();
		System.out.print("Please provide the Key for your message between 0 and 25: ");
		
		int key = input.nextInt();
		
		if (key < 0 || key > 25) {
			
			System.out.println("invalid please provide a key using integers between 0 and 25");
			
			return;
			
			
		}
		
		char[] letters = "abcdefghijklmnopqrstuvwxyz" .toCharArray(); // array containing letters
		int[] numbers = new int[26];
		
		for (int i = 0; i < letters.length; i++ ) {
			
			numbers[i] = i + 1 ;
						
		}
		
		System.out.println();
		 System.out.print("here is the encryption: ");
		
		for (char letter : message.toCharArray()) {
			
			
			
			if (Character.isLetter(letter)) {
				
				int index = Character.toLowerCase(letter) - 'a'; // a starts the index and converts to lowercase
				
				int encryptedIndex = (index + key)% 26; // encrpytion function f(p) = (p+k)mod26
				
				int encryptedNumber = encryptedIndex ;
				
				char encrpytedLetter = (char) ('a' + (encryptedNumber )); // convert back to letter
				 
				 System.out.print(encrpytedLetter);
			 
			} else if (letter == ' ') {// check for space
				System.out.print(letter);// print space unchanges
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
