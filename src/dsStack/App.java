package dsStack;

public class App {

	public static void main(String[] args) {
		Stacks theStack = new Stacks(6);
		System.out.println(reverseString("Hello"));
		
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(60);
		myQueue.insert(70);
		myQueue.insert(3420);
		myQueue.insert(762);
		myQueue.view();
		/*theStack.push();
		theStack.push(40);
		theStack.push(50);
		theStack.push(70);
		theStack.push(80);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}*/
		

	}
	public static String reverseString(String str){
		int stackSize = str.length();  
		Stacks theStack = new Stacks(stackSize);
		for(int j = 0 ; j<str.length(); j++) {
			char ch = str.charAt(j);
			theStack.push(ch);
		}
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result + ch;
		}
		return result;
	}

}
