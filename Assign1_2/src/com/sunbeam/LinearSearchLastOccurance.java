package com.sunbeam;

import java.util.Scanner;

public class LinearSearchLastOccurance {
	
	public static int linearSearchLastAccurance(int[] arr, int key)
	{
		int lastIndex = -1; // Initialize the index to -1, indicating no occurance found yet.
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				lastIndex = i; // Update the last index whenever a match is found.
			}
		}
		
		return lastIndex;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,5,7,9,8,3,4,33,25};
		System.out.println("Enter Your Searched Key : ");
		int searchedKey = sc.nextInt();
		
		int result = linearSearchLastAccurance(arr, searchedKey);
		if (result != -1) {
			System.out.println("The Last Accurance of " + searchedKey + " is at index : " +result);
		}
		else {
			System.out.println(searchedKey + " not found in the Array");
		}	
		
		sc.close();
	}
}
