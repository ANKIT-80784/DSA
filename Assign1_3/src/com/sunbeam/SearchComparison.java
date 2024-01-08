package com.sunbeam;

import java.util.Scanner;

public class SearchComparison {
	
	public static int performLinearSearch(int[] arr, int key)
	{
		int comparisons = 0;
		for (int i = 0; i < arr.length; i++) {
			comparisons++;
			if (arr[i] == key) {
				return comparisons;
			}
		}
		return comparisons;	
	}
	
	public static int performBinarySearch(int[] arr, int key)
	{
		int comparisons = 0;
		int low = 0, high = arr.length - 1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			comparisons++;
			
			if (arr[mid] == key) {
				return comparisons;
			}
			else if (arr[mid]<key) {
				low = mid+1;
			}
			else
				high = mid-1;
		}
		
		return comparisons;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Sorted elements of the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key to Search : ");
		int key = sc.nextInt();
		
		int linearSearchComparison = performLinearSearch(arr, key);
		System.out.println("Linear Search Comparisons : " +linearSearchComparison);
		
		int binarySearchComparison = performBinarySearch(arr, key);
		System.out.println("Binary Search Comparisons : " +binarySearchComparison);
		
	}

}
