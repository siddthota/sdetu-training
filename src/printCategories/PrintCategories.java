package printCategories;

import java.util.Arrays;

public class PrintCategories {

	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in" +
				" the category:apparel and the slightly more in demand category:makeup along with the" +
				" category:furniture and many more that you need to be aware";
		
		String[] arrStr = str.split(" ");
		System.out.println("The current string array: " + Arrays.toString(arrStr));
		printCategories(str);
		lengthOfString(arrStr);
		reverseString(arrStr);		

	}
	
	
	public static void printCategories(String str) {
		
		System.out.println("Display all categories mentioned in the string");
		
		int i=0;
		while(true) {
			int found = str.indexOf("category:", i);
			System.out.println("Category found at: " + found);
			if(found == -1) {
				System.out.println("Categories not found");
				break;
			}
			int start = found+9;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end+1;
		}
		
	}
	
	public static void lengthOfString(String[] str) {
		int count = 0;
		
		for(int i=0; i<str.length; i++) {
			count = count+1;
		}
		System.out.println("The Length of String Str is " + count);
		
	}
	
	
	public static void reverseString(String[] str) {
		String reverseString = "";
		
		for(int i= str.length -1 ; i >= 0; i-- ) {
			reverseString = reverseString + str[i];
			reverseString = reverseString + " ";
		}
		System.out.println("Reversed String is: " + reverseString);
		String[] reverseArrStr = reverseString.split(" ");
		System.out.println("Printing the reverse string as an array: " + Arrays.toString(reverseArrStr));
		
	}

}
