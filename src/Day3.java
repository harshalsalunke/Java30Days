import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		//Factorial Finder
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scan.nextInt();
		int numCopy=num;
		int factor=1;
		// Iteratively calculate the factorial
		if(num>=1) {
		while(numCopy!=0)
		{
			factor=factor*numCopy;
			numCopy--;
		}
		
		System.out.println("Factorial of "+num+" is "+factor);
		}
		else
			System.out.println("Number entered is negative");
		scan.close();
		
	}

}
