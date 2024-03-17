import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day22 {

	public static void main(String[] args) throws IOException {
		// Read text file
		String text;
		System.out.println("Reading file using BufferedReader");
		File file = new File("resource\\name.txt");
		// 1 method using BufferaReader
		BufferedReader br = new BufferedReader(new FileReader(file));

		while ((text = br.readLine()) != null) {
			System.out.println(text);
		}
		
		String text1;
		System.out.println("Reading file using Scanner");
		// 2 method using Scanner
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			text1 = scan.nextLine();
			System.out.println(text1);
		}
		
		
		br.close();
		scan.close();

	}
	
	

}
