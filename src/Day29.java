import java.util.Arrays;

public class Day29 {

	public static void main(String[] args) {
		// selection sort
		int arr[] = { 25, 1, 2, 3, 3, 7,-8,-25 };
		System.out.println("Original Array: " 
		+ Arrays.toString(arr));
		int minIndex = 0, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}

		}
		System.out.println("Sorted using selection sort: "
		+ Arrays.toString(arr));

	}

}
