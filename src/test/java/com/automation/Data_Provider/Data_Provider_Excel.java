package com.automation.Data_Provider;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data_Provider_Excel {

	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellType celltype;

	public static Object[][] readFromExcelSheet(String sheetName) throws Exception {

		ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/java/com/automation/Recap_Project/ExcelData.xlsx");

		workbook = new XSSFWorkbook(ip);
		sheet = workbook.getSheet(sheetName);

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];
		for (int i = 0; i < rows; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < cols; j++) {
				cell = row.getCell(j);
				celltype = cell.getCellType();

				switch (celltype) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				default:
					break;
				}

			}
		}

		return data;
	}

	@DataProvider(name = "LOGINTN")
	public Object[][] getLoginTNExcel() throws Exception {
		Object[][] data = Data_Provider_Excel.readFromExcelSheet("LoginTN");
		return data;
	}
	
	@DataProvider(name = "REGISTERTN")
	public Object[][] getRegisterTNExcel() throws Exception {
		Object[][] data = Data_Provider_Excel.readFromExcelSheet("RegisterTN");
		return data;
	}

}

// Rule 1: add to the pom files all these dependencies Apache poi:
/*
 * <!-- https://mvnrepository.com/artifact/org.apache.poi/poi --> <dependency>
 * <groupId>org.apache.poi</groupId> <artifactId>poi</artifactId>
 * <version>4.1.2</version> </dependency> <!--
 * https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml --> <dependency>
 * <groupId>org.apache.poi</groupId> <artifactId>poi-ooxml</artifactId>
 * <version>4.1.2</version> </dependency> <!--
 * https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml-schemas -->
 * <dependency> <groupId>org.apache.poi</groupId>
 * <artifactId>poi-ooxml-schemas</artifactId> <version>4.1.2</version>
 * </dependency> <!--
 * https://mvnrepository.com/artifact/org.apache.poi/poi-scratchpad -->
 * <dependency> <groupId>org.apache.poi</groupId>
 * <artifactId>poi-scratchpad</artifactId> <version>4.1.2</version>
 * </dependency> <!--
 * https://mvnrepository.com/artifact/org.apache.poi/poi-excelant -->
 * <dependency> <groupId>org.apache.poi</groupId>
 * <artifactId>poi-excelant</artifactId> <version>4.1.2</version> </dependency>
 * <!-- https://mvnrepository.com/artifact/org.jxls/jxls-poi --> <dependency>
 * <groupId>org.jxls</groupId> <artifactId>jxls-poi</artifactId>
 * <version>2.12.0</version> </dependency>
 */

// Rule 2: create excel file .xlsx
// Rule 3: Close the excel sheet, copy and paste it in your package
// Rule 4: Create the Object of FileInputStream class
// Rule 5: Create the object of XSSFWorkbook
// Rule 6: Create the reference to the individual sheet XSSFSheet
// Rule 7: we have to identify the n' of col and n' of rows
// Rule 8: Create a 2D array and return the object array