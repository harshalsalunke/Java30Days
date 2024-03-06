import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day19 {
	public static ArrayList<Integer> mergeArray(ArrayList<Integer> arr1, 
			ArrayList<Integer> arr2) {

		arr1.addAll(arr2);
		Collections.sort(arr1);
		return arr1;
	}

	public static void main(String[] args) {
		// Merging and Sorting Arrays
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> merge = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int len = scan.nextInt();
		System.out.println("Enter elements of 1st array");
		for (int i = 0; i < len; i++) {
			arr1.add(scan.nextInt());
		}
		System.out.println("Enter elements of 2nd array");
		for (int i = 0; i < len; i++) {
			arr2.add(scan.nextInt());
		}
		merge = mergeArray(arr1, arr2);
		System.out.println("Merged Array (Sorted):" + merge);
		scan.close();

	}

}
