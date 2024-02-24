import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		// Palindrome Check
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Number or String");
		String str=scan.next().toString();
		StringBuilder str1 =new StringBuilder(str);
		//Reverse the StringBuilder object and compare it with the original input string
		Boolean result=str1.reverse().toString().equals(str);
		if(result)
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");
		scan.close();
	}

}
