import java.util.ArrayList;
import java.util.Scanner;

public class Day15 {
	public static void findIntersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> common = new ArrayList<>(arr1);
        // Retain only the elements that are common to both arrays
        common.retainAll(arr2);

        if (!common.isEmpty()) {
            System.out.println(common);
        } else {
            System.out.println("No common elements found.");
        }
    }
	public static void inputElements(ArrayList<Integer> arr, Scanner scan, int len) {
        for (int i = 0; i < len; i++) {
            arr.add(scan.nextInt());
        }
    }

	public static void main(String[] args) {
		//write a Java program that finds the intersection of two integer arrays. 
		//The intersection of two arrays contains elements that are present in both arrays.
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of the Array: ");
		int len=scan.nextInt();
		System.out.println("Enter elements for the first array:");
        inputElements(arr1, scan, len);

        System.out.println("Enter elements for the second array:");
        inputElements(arr2, scan, len);

        System.out.println("Intersection of the arrays:");
        findIntersection(arr1, arr2);
		
		scan.close();
		
	}

}
