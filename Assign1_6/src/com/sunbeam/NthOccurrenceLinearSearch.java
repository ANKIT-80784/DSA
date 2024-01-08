package com.sunbeam;

public class NthOccurrenceLinearSearch {

    public static int findNthOccurrence(int[] array, int target, int n) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;

                if (count == n) {
                    return i; // Nth occurrence found, return the index
                }
            }
        }

        return -1; // Nth occurrence not found
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 5, 1, 5, 3, 5};
        int target = 5;
        int nthOccurrence = 3;

        int result = findNthOccurrence(array, target, nthOccurrence);

        if (result != -1) {
            System.out.println("The " + nthOccurrence + "th occurrence of " + target + " is at index " + result);
        } else {
            System.out.println("The " + nthOccurrence + "th occurrence of " + target + " is not found in the array");
        }
    }
}

