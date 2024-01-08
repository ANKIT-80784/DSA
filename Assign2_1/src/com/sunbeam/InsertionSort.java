package com.sunbeam;

public class InsertionSort {
	
	private static int InsertionSort(int[] arr) {
		int comparisons = 0;
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			
			while (j >= 0 && key < arr[i]) {
				arr[j+1] = arr[j];
				j--;
				comparisons++;
			}
			arr[j+1] = key;	
		}
		return comparisons;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {14,23,11,55,33};
		
		int comparisonsCount = InsertionSort(arr);
		System.out.println("Sorted Array : ");
		 for (int num : arr) {
			System.out.println(num+ " ");
		}
		 System.out.println("\nNumber of Comparisons : " +comparisonsCount);
	}
}
