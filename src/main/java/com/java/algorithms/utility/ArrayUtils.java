package com.java.algorithms.utility;

public class ArrayUtils {
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static void printSubArray(int[] arr, int start, int end) {
		System.out.print("[");
		for (int i = start; i < end; i++) {
			System.out.print(arr[i]);
			if (i != end - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
