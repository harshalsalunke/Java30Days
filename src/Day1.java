
public class Day1 {

	public static void main(String[] args) {
		// FizzBuzz Challenge
		
		for(int i=1;i<=15;i++)
		{
			// Check if the number is divisible by both 3 and 5
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			// Check if the number is divisible by 3
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			// Check if the number is divisible by 5
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			// If the number is not divisible by either 3 or 5, print the number itself
			else
			{
				System.out.println(i);
			}
		}

	}

}
