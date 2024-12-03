package MP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NewMP {
	@Test
	public void m1() {
		System.out.println("m1");

	}

	@Test

	public void m2() throws IOException
	{
		String fd="C:/Users/STEPHEN/OneDrive/Desktop/stephen.xlsx";

		//System.out.println(fo.length() + "--->" + fn.length());

		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(fd)));

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowSize = sheet.getPhysicalNumberOfRows();// 15

		for (int i = 0; i < rowSize; i++) {

			int columnSize = sheet.getRow(i).getPhysicalNumberOfCells();

			for (int j = 0; j < columnSize; j++) {

				XSSFRow row = sheet.getRow(i);

				XSSFCell cell = row.getCell(j);

				DataFormatter format = new DataFormatter();

				String value = format.formatCellValue(cell);

				System.out.print(value + "|");

			}

			System.out.println();

		}

	}

}
