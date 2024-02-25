import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		// Fibonacci Sequence
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int num=scan.nextInt();
		int next=1,previous=0;
		System.out.println("Fibonacci Sequence is:");
		System.out.println(previous);
		System.out.println(next);
		
		for(int i=0;i<num-2;i++)
		{
			int temp;
			System.out.println(previous+next);
			temp=previous;
			previous=next;
			next+=temp;
		}
		
		scan.close();

	}

}
