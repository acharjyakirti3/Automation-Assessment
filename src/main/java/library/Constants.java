package library;

public interface Constants {
	String excelpath="./excelfiles/Automation_Assement.xlsx";
	String sheetname="Amazon Site";
	String appUrl=Excel.readExcelData(excelpath, sheetname, 0, 0);
	String username="8763325028";
	String pwd="New@1234";
	String search=Excel.readExcelData(excelpath, sheetname, 0, 3);
	
}
