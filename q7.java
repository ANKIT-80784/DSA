import java.util.Scanner;

public class q7 {

    public static int findFirstNonRepeatingElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            boolean isRepeated = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && currentElement == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return currentElement;
            }
        }

        // If no non-repeating element is found
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter value at index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array: " + java.util.Arrays.toString(arr));

        int firstNonRepeating = findFirstNonRepeatingElement(arr);

        if (firstNonRepeating != -1) {
            System.out.println("First Non-Repeating Element: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating element found.");
        }

        sc.close();
    }
}
