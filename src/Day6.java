import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// Armstrong number
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		Integer num=scan.nextInt();
		int remainingDigits =num;
		int sum=0;
		int numDigits  = num.toString().length();
		while(remainingDigits >0)
		{
			int single=remainingDigits %10;
			sum=sum+(int) Math.pow(single, numDigits );
			remainingDigits/=10;
		}
		if(sum==num)
		{
			System.out.println("Number is Armstrong number");
		}
		else
			System.out.println("Number is not Armstrong number");

		scan.close();
	}

}
