package algorithms;

public class BubbleSort {

	public static void bubbleSort(int[] dataSet) {
		boolean swapped = false;
		System.out.println("Original Array before Swap");
		printArr(dataSet);
		do {
			for(int i=0; i< dataSet.length-1; i++) {
				if(dataSet[i] > dataSet[i+1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					printArr(dataSet);
					swapped = true;
				}
			}
		}while(swapped);
	}

	private static void printArr(int[] arr) {
		System.out.println("After Swap");
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
