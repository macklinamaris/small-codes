
public class selectionSort {

	public static int [] numbers = {2, 19, 18, 16, 17, 15, 14, 7, 12, 11, 10, 9, 8, 13, 6, 5, 4, 3, 20, 1};
	
	public void sortArray( int[] numbers) {
		
		int min; // holds current minimum integer in array
		int temporary; // variable to temporarily hold a value
		
		
		for (int index = 0; index < numbers.length - 1; index++) {// index starts at 0 cant be over the length of the array and index increases every loop
			
			
			min = index; // start the min value at the beginning of the index
			
			//scan gets the number after the index
			for (int scan = index + 1; scan < numbers.length; scan++) {
				
				
				if (numbers[scan] < numbers[min]) {
					
					min = scan;
					
					//swap the values
					temporary = numbers[min];
					numbers[min] = numbers[index];
					numbers[index] = temporary;
					
					
					
				}
				
				
				
				
			}
			
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int min;
		
		
		for (int i = 0; i < numbers.length; i++) {// loop continues untill array is completely sorted
            System.out.print(numbers[i] + " ");
        }
		
	        selectionSort array = new selectionSort();
	        
	        for (int index = 0; index < numbers.length - 1; index++) {
				
				
				min = index;
				
				
				for (int scan = index + 1; scan < numbers.length; scan++) {
					
					
					if (numbers[scan] < numbers[min]) {
	        
	        
	        array.sortArray(numbers);
	        
	        
					}
					
					
				}
				
	        }
	        
	        System.out.println();
	        
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	

	}

}
