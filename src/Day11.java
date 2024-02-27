import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		// Challenge: Prime Number Checker
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		int inputNumber=scan.nextInt();
		Boolean isPrime=true;
		for(int i=2;i<inputNumber-1;i++)
		{
			if(inputNumber%i==0 && inputNumber!=2)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(inputNumber+" is Prime.");
		else
			System.out.println(inputNumber+" is NOT Prime.");
		
		scan.close();
		
	}

}
