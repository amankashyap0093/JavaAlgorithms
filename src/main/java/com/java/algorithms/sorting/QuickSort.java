package com.java.algorithms.sorting;

import com.java.algorithms.utility.ArrayUtils;

public class QuickSort {

	
	public void sort(int[] arr, int low, int high) {
		if(low < high) {
			int pivotIndex = partition(arr, low, high);
			sort(arr, low, pivotIndex-1);
			sort(arr, pivotIndex+1, high);
		}
	}
	
	private int partition(int[] arr, int low, int high) {
		//Take the last element of the array as the pivotValue which will be used for partitioning.
		int pivotValue = arr[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			
			if(arr[j] < pivotValue) {
				i++;
				ArrayUtils.swap(arr, i, j);
				//ArrayUtils.printArray(arr);
			}
		}
		
		//Swap (i+1) index value which is pivot Value
		ArrayUtils.swap(arr, i+1, high);
		return i+1;
	}
	
	public static void main(String[] args) {

		int[] unsortedArray = { 12, 10, 15, 78, 52, 4, 3 };
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(unsortedArray, 0, unsortedArray.length-1);
		System.out.println("Sorted Array:");
		ArrayUtils.printArray(unsortedArray);
	}
}
