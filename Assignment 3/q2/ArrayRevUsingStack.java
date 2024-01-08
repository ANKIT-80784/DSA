package q2;
import java.util.Arrays;

public class ArrayRevUsingStack {
	
	public static void revArr(int[] arr) {
		Stack1 st = new Stack1(arr.length);
		for(int i=0; i < arr.length; i++)
		{
			st.push(arr[i]);
		}
		
		for(int i=0;i <arr.length; i++) {
			arr[i] = st.pop();
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55};
		
		System.out.println("Array : " + Arrays.toString(arr));
		
		revArr(arr);
		
		System.out.println("Reversed Array : " + Arrays.toString(arr));
		
		

	}

}
