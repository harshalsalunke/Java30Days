import java.util.ArrayList;


public class Day17 {
	public static int divide(int arr[], int n) {
		int left = 0;
		for (int i = 0; i < n; i++) {
			left += arr[i];

			int right = 0;
			for (int j = i + 1; j < n; j++) {
				right += arr[j];
			}

			if (left == right) {
				return i + 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 5 };
		int n = arr.length;
		int index = divide(arr, n);
		if (index != -1) {
			ArrayList<Integer> leftSubarray = new ArrayList<>();
			ArrayList<Integer> rightSubarray = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				if (i < index) {
					leftSubarray.add(arr[i]);
				} else {
					rightSubarray.add(arr[i]);
				}
			}
			System.out.println("Subarray 1: " + leftSubarray);
			System.out.println("Subarray 2: " + rightSubarray);
		} else {
			System.out.println("It's not possible to divide the array into two equal sum subarrays.");
		}

	}

}
