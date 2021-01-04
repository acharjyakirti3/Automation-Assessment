package library;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String readExcelData(String path,String sheet,int row,int cell) {
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			data=workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
			workbook.close();
		} catch (Exception e) {
			System.out.println("File Not Found................ "+e.getStackTrace());
		}
		return data;
	}

}