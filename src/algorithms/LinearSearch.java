package algorithms;

public class LinearSearch {
	
	public static int linearSearch(int[] dataSet, int target) {
		//iterate throught dataset searching for the target
		for(int i =0; i<dataSet.length; i++) {
			if(dataSet[i] == target) {
				return i;
			}
		}
		return -1;
		
	}



}
