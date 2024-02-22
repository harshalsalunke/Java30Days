import java.util.HashSet;
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> list1=new HashSet<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		    if (ch != ' ')  
		        list1.add(ch);
		}
		System.out.println("Length of the longest substring without repeating characters:"+list1.size());
		scan.close();
	}

}
