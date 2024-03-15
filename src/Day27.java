 import java.util.Arrays;

public class Day27 {

	public static void main(String[] args) {
		// Bubble Sort
		int arr[] = { 25, 1, 2, 3, 3, 7,-8,-25 };
		boolean swapped;
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			// If no swaps were made in this pass, the array is already sorted
			if (!swapped) {
				break;
			}
			System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));
		}
		System.out.println("Sorted Array:" + Arrays.toString(arr));
	}
}
