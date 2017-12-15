package algorithms;

public class BinarySearch {

	public static int binarySearch(int[] dataSet, int target, int start, int stop) {
		//binary search assumes a sorted array and can therefore continually split our search domain in half.

		int middle = (int) Math.floor((start+stop)/2);
		int value = dataSet[middle];

		System.out.println(value + " " + middle);
		if(value < target) {
			return binarySearch(dataSet, target, middle + 1, stop);
		} else if (value > target) {
			return binarySearch(dataSet, target, start, middle -1);
		}
		System.out.println(target + " = " + value);
		return middle;
	}
}
