import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		//Day 10 Challenge: Array Rotation
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of Array");
		int len=scan.nextInt();
		int arr[]=new int[len];
		int rot[]=new int[len];
		System.out.println("Enter Array");
		for(int i=0;i<len;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Original Array");
		for(int i : arr)
		{
			System.out.println(i);
		}
		System.out.println("Enter number of steps to rotate");
		int rotate=scan.nextInt();
		
		for (int i = 0; i < len; i++) {
            rot[(i + rotate) % len] = arr[i];
        }
		System.out.println("Rotated Array");
		for(int i : rot)
		{
			System.out.println(i);
		}
		scan.close();

	}

}
