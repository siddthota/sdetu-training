package algorithms;
import java.util.Arrays;
public class DemoApp {

	public static void main(String[] args) {
		int[] numbers = {10, 43, 12, 567, 123, 64, 2123, 35, 11, 341, 43, 1452, 2131, 324, 2138};
		int[] sortedNumbers = {10, 11, 12, 35, 43, 64, 123, 341, 567, 2123, 4432, 6453};

		int pos = algorithms.LinearSearch.linearSearch(numbers, 64);
		System.out.println("Found at position: " + pos);

		int index = algorithms.BinarySearch.binarySearch(sortedNumbers, 341, 0, sortedNumbers.length);
		System.out.println("Found at position: " + index);

		algorithms.BubbleSort.bubbleSort(numbers);
	}

}
