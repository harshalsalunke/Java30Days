import java.util.Arrays;

public class Day20 {

	public static void main(String[] args) {
		// finding 2nd max number
		int arr[] = { 1, 2, 5, 7, 9, 12, 25, 6, 26 };
		// Method 1: Using a loop to find the second largest number
		int max_value = Integer.MIN_VALUE;
		int SecondMax_value = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max_value) {
				SecondMax_value = max_value;
				max_value = i;
			}
		}
		System.out.println("Second Max Value: " + SecondMax_value);
		// Method 2: Sorting the array and accessing the second largest number
		Arrays.sort(arr);
		System.out.println("Second Max Value with Array Sort method: " + arr[arr.length - 2]);

	}

}
