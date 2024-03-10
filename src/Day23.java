import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day23 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String text = null;
		String longWord = null;
		int len = 0;
		File file = new File("resource\\name.txt");

		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) 
		{
			text = scan.nextLine();
			System.out.println("Text file content: "+text);
		
			String[] words = text.split(" ");
            for (String word : words) {
                if (word.length() > len) {
                    len = word.length();
                    longWord = word;
                }
            }
			
		}
		System.out.println("Longest Word is: " + longWord);
		scan.close();

	}

}
