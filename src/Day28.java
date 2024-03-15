import java.util.Arrays;

public class Day28 {

	public static void main(String[] args) {
		// Insertion sort
		int arr[] = { 25, 1, 2, 3, 3, 7,-8,-25 };
		int temp, j;
		System.out.println("Original Array: "+Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		System.out.println("Sorted Array: "+Arrays.toString(arr));

	}

}
