//import java.util.Arrays;

public class Day20 {

	public static void main(String[] args) {
		// finding 2nd max number
		 //int arr[] = { 1, 2, 25, 6, 26 };
		
		 /* Arrays.sort(arr); // Method 1: Using a loop to find the second largest number
		 int max_value = Integer.MIN_VALUE; int SecondMax_value = Integer.MIN_VALUE;
		  for (int i : arr) { if (i > max_value) { SecondMax_value = max_value;
		  max_value = i; } } System.out.println("Second Max Value: " +
		  SecondMax_value);*/
		 
		int arr[] = { 30, 30, 28, 30, 28, 1};
		int max = arr[0];
		int smax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax && arr[i] != max) {
				smax = arr[i];
			}
			
		}
		if(smax==Integer.MIN_VALUE) {
			System.out.println("All values are same in array");
		}
		else
		System.out.println("Second Max value: " + smax);

	}

}
