import java.util.Stack;
import java.util.Scanner;


public class StackBasics<T> implements StackInterface<T> {
	

	Stack<T> theStack;
	
	public StackBasics() {
		
	theStack = new Stack<>();	
	
	}
	
	public void push(T newEntry) {//method to push item into stack
		theStack.push(newEntry); 
}
	
	public T peek(){//method to peek at top item
		return theStack.peek();	
}
	
	public T pop() {//method to pop top item of stack
		return theStack.pop(); 
}
	
	public boolean isEmpty() { //method to check if stack is empty
		return theStack.isEmpty(); 
		
}
	
	public void clear() {//method to clear stack
		
		theStack.clear(); 
}
	
		

	
	public static void main(String[] args) {
	
		
		StackBasics<Character> myStack = new StackBasics<Character>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		System.out.println();
		String myString = input.nextLine();
		
		for( int i = 0; i < myString.length(); i++) { // loop to push individual characters in stack
			
			myStack.push(myString.charAt(i));
			
			
			
		}
		
		while(!myStack.isEmpty()) {// loop to pop charcaters until stack is empty
			
			
			System.out.print(myStack.pop());
			
			
		}
		
	}

}


