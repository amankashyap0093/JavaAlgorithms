package com.java.algorithms.sorting;

import com.java.algorithms.utility.ArrayUtils;

public class MergeSort {

	public void merge(int[] arr, int startingIndex, int middleIndex, int endIndex) {

		int n1 = middleIndex - startingIndex + 1;
		int n2 = endIndex - middleIndex;

		int[] subArray1 = new int[n1];
		int[] subArray2 = new int[n2];

		for (int i = 0; i < n1; i++) {
			subArray1[i] = arr[startingIndex + i];
		}

		for (int i = 0; i < n2; i++) {
			subArray2[i] = arr[middleIndex + 1 + i];
		}

		int i = 0, j = 0, k = startingIndex;

		while (i < n1 && j < n2) {

			if (subArray1[i] <= subArray2[j]) {
				arr[k] = subArray1[i];
				i++;
			} else {
				arr[k] = subArray2[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = subArray1[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = subArray2[j];
			j++;
			k++;
		}

	}

	public void sort(int[] arr, int startingIndex, int endIndex) {
		if (startingIndex < endIndex) {

			int middleIndex = (startingIndex + (endIndex - 1)) / 2;

			sort(arr, startingIndex, middleIndex);
			sort(arr, middleIndex + 1, endIndex);

			merge(arr, startingIndex, middleIndex, endIndex);
		}
	}

	
	public static void main(String[] args) {

		int[] unsortedArray = { 12, 10, 15, 78, 52, 4, 3 };
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(unsortedArray, 0, unsortedArray.length-1);
		ArrayUtils.printArray(unsortedArray);
	}
}
