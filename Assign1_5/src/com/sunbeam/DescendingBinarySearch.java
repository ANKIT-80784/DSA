package com.sunbeam;

public class DescendingBinarySearch {
	
	private static int binarySearchDescending(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]<target) {
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] sortedArray = {20, 15, 10, 8, 6, 5, 3, 2, 1};
		int target = 17;
		
		int result = binarySearchDescending(sortedArray, target);
		
		if (result!=-1) {
			System.out.println("Element "+ target + " found at index " +result);
		}
		else
		{
			System.out.println("Element "+ target + " not found in the Array.");
		}
		
	}
}
