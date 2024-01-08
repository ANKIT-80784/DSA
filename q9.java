import java.util.Arrays;

public class q9 {
		
	public static int sort(int arr[]) {
		int comp=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				comp++;
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		return comp;
	}

	public static void main(String[] args) {
		int arr[]= {11,65,33,22,49,55,28,77,38};
		System.out.println("before sort "+Arrays.toString(arr));
		int comp =sort(arr);
		
		System.out.println("after sort "+Arrays.toString(arr));
		System.out.println("No of comparisons="+comp);
	}

}