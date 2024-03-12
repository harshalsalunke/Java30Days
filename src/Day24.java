import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class Day24 {

	public static void main(String[] args) throws IOException {
		//Read Excel file
		FileInputStream file = new FileInputStream
				(new File("resource\\credentials.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (Row row : sheet) {
			for (Cell cell : row) {
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
		file.close();

	}

}
