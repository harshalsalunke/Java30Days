import java.util.ArrayList;
import java.util.Scanner;

public class Day16 {
	public static void inputElements(ArrayList<Integer> arr, Scanner scan, int len) {
        for (int i = 0; i < len; i++) {
            arr.add(scan.nextInt());
        }
    }
	public static int maximumElement(ArrayList<Integer> arr)
	{
		int max=Integer.MIN_VALUE;
		for (int num:arr)
		{
			if(num>max) {
				max=num;
			}			
		}
		return max;
	}

	public static void main(String[] args) {
		// Maximum Element in an Array
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter length of the Array: ");
		int len=scan.nextInt();
		System.out.println("Enter elements of Array: ");
		inputElements(arr, scan, len);
		System.out.println("Max Element in Array is "+maximumElement(arr));
		
		

	}

}
