package com.sunbeam;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean CheckPalindrome(String str)
	{
	
		int left = 0;
		int right = str.length()-1;
		while (left <= right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean CheckPalindrome(int str)
	{
		String str1 = Integer.toString(str);

	// 123321
		int left = 0;
		int right = str1.length()-1;
		while (left <= right) {
			if (str1.charAt(left) != str1.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		boolean isPalindromeInt = CheckPalindrome(num);

		if(isPalindromeInt)
		{
			System.out.println(num + " is Palindrome");
		}
		else
		{
			System.out.println(num + "is not a palindrome");
		}
		
		System.out.println("Enter a String : ");
		String str1 = sc.next();
		boolean IsPalindromeStr = CheckPalindrome(str1);
		
		if (IsPalindromeStr) {
			System.out.println(str1 + " is Palindrome.");
		}
		else 
		{
			System.out.println(str1 + " is not Palindrome.");
		}	
	}
}
