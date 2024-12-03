package MP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class EntireDatawithArray {
	String stringArray[][];

	public String[][] getEntireDataStrings(String excelPath, String sheetName) throws IOException {

			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(excelPath)));

			XSSFSheet sheet = workbook.getSheet(sheetName);

		int rowSize = sheet.getPhysicalNumberOfRows();// 15

		int columnSize = sheet.getRow(0).getPhysicalNumberOfCells();

		stringArray = new String[rowSize][columnSize];

		for (int i = 0; i < rowSize; i++) {

			for (int j = 0; j < columnSize; j++) {

				XSSFRow row = sheet.getRow(i);

				XSSFCell cell = row.getCell(j);

				DataFormatter format = new DataFormatter();

				stringArray[i][j] = format.formatCellValue(cell);

			}

		}

		return stringArray;
	}

}
