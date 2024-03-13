import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Day26 {

	public static void main(String[] args) throws IOException {
		
		
	        File originalFile = new File("resource\\name.txt");
	        File copyFile = new File("resource\\copyfile.txt");

	        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile));
	             BufferedWriter writer = new BufferedWriter(new FileWriter(copyFile))) {

	            // Read data from the original file and write it to the copy file
	            String line;
	            while ((line = reader.readLine()) != null) {
	                writer.write(line);
	                writer.newLine(); // Add newline after each line
	            }

	            System.out.println("File copied successfully.");

	        } catch (IOException e) {
	            System.err.println("Error occurred while copying the file: " + e.getMessage());
	            e.printStackTrace();
	        }
		}
			
		
	

}
