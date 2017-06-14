package SeleniumGenric;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGenric {
static XSSFWorkbook book;
static Sheet sht;
static HSSFWorkbook hssfbook;
	
	
	public static String readExcel(String path,int sheet, int row ,int column) throws IOException{
		File filepath=new File(path);
		String[] excelSplit=path.split("\\.");
		String filePath=excelSplit[0];
		String fileExtension=excelSplit[1];
		FileInputStream iofile=new FileInputStream(filepath);
		String value="";
	if(fileExtension.equalsIgnoreCase("xlsx")){
		 book=new XSSFWorkbook(iofile);
	     sht=book.getSheetAt(sheet);
	 value=sht.getRow(row).getCell(column).getStringCellValue();
	}else if(fileExtension.equalsIgnoreCase(".xls")){
		hssfbook=new HSSFWorkbook();
		Sheet sht=hssfbook.getSheetAt(sheet);
		 value=sht.getRow(row).getCell(column).getStringCellValue();
	}
	return value;
		
		
	}
	
	public static void writeCellValue(String path){
		File filePath=new File(path);
		
		
		
	}
	
	public static void main(String[] args) throws IOException{
		String value=readExcel("Resources//Book1.xlsx", 0, 0, 0);
		System.out.println(value);
		
	}
	
}
