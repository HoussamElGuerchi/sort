package io.houssam.sort;

public class Main {
	
	static void exp01() {
		int[] array = {9,3,7,5,6,4,8,2};
		MergeSort.sort(array);
		printArray(array);
	}
	
	static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("]\n");
	}

	public static void main(String[] args) {
		exp01();
	}

}
