package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static void InsertionSortDescending(int[] arr) {

		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			// Change the condition sort in descending order.
			while (j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 2, 9, 1, 5, 6 };
		System.out.println("Before Sorted Array in Descending Order : " + Arrays.toString(arr));
		InsertionSortDescending(arr);
		System.out.println("After Sorted Array in Descending Order : " + Arrays.toString(arr));
	}

}
