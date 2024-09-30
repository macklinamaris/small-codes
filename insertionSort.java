
public class insertionSort {
	
	public static int [] numbers = {2, 19, 18, 16, 17, 15, 14, 7, 12, 11, 10, 9, 8, 13, 6, 5, 4, 3, 20, 1};

	
	
	public void sortArray(int[] numbers) {
		
		for(int index = 1; index < numbers.length; index++) {
			
			int key = numbers[index];
			int position = index;
			
			//shift larger value right
			while( position > 0 && key < numbers[position - 1]) {
				
				numbers[position] = numbers[position - 1];
				position--;
				
				
				
				
			}
			
			numbers[position] = key;
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		//loop to print array "numbers"
				for (int i = 0; i < numbers.length; i++) {
		            System.out.print(numbers[i] + " ");
		

	}
				
				insertionSort array = new insertionSort();
				
				array.sortArray(numbers);

				
				
				
				System.out.println();
				System.out.println();
				
				for (int i = 0; i < numbers.length; i++) {
		            System.out.print(numbers[i] + " ");
		

	}
}
}
