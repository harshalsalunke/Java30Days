import java.util.Scanner;

public class Day14 {
	public static int countVowels(String str)
	{
		int count=0;
		for(char c : str.toLowerCase().toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Count vowels
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=scan.nextLine();
		scan.close();
		System.out.println("Number of vowels in the string are: "+countVowels(str));
		

	}

}
