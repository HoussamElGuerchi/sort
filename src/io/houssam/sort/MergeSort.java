package io.houssam.sort;

public class MergeSort {
	
	public static void sort(int[] array) {
		int[] temp = new int[array.length]; // Temp array to use in merge
		sort(array, temp, 0, array.length - 1);
	}
	
	private static void sort(int[] array, int[] temp, int low, int high) {
		if (low < high) { // Large array to divide
			int mid = (low+high)/2;
			sort(array, temp, low, mid);
			sort(array, temp, mid+1, high);
			merge(array, temp, low, mid, high); // Conquer
		}
	}
	
	private static void merge(int[] array, int[] temp, int low, int mid, int high) {
//		Copy both halves into a helper array
		for (int i = 0; i<= high; i++ ) {
			temp[i] = array[i]; 
		}
		
		int leftSize = mid;
		int rightSize = high;
		
		int helperLeft = low;
		int helperRight = mid+1;
		int current = low;
		
//		Iterate through helper array. Compare the left and right half, copying back
//		the smaller element from the two halves into the original array.
		while(helperLeft <= leftSize && helperRight <= rightSize) {
			if (temp[helperLeft] <= temp[helperRight]) {
				array[current] = temp[helperLeft];
				helperLeft++;
			} else {
				array[current] = temp[helperRight];
				helperRight++;
			}
			current++;
		}
		
//		Copy the remaining element into the target array
		while(helperLeft <= leftSize) {
			array[current] = temp[helperLeft];
			helperLeft++; current++;
		}
		
		while(helperRight <= rightSize) {
			array[current] = temp[helperRight];
			helperRight++; current++;
		}
	}
}
