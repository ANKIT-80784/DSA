import java.util.Arrays;
import java.util.Scanner;

public class q8 {

	public static int findRank(int arr[], int x) {
		int rank = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= x)
				rank++;
		}

		return rank;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter value of index" + i);
			arr[i] = sc.nextInt();
		}

		System.out.print(Arrays.toString(arr));

		System.out.println("/nEnter int of which rank to be find");
		int x = sc.nextInt();

		int rank = findRank(arr, x);
		System.out.println("Rank of element " + x + " is " + rank);

	}

}
