package readExceldata;

import java.io.File;
import java.io.FileInputStream;


import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*File src=new File("C:\\Book1.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data From Excel is "+data);
		wb.close();*/
		try{
			File src=new File("C:\\Book1.xlsx");
			FileInputStream fis=new FileInputStream(src);
			// Load workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			//Load sheet- Here we are loading first sheetonly
			XSSFSheet sh1= wb.getSheetAt(0);
			// getRow() specify which row we want to read.
            // and getCell() specify which column to read.
			// getStringCellValue() specify that we are reading String data.
			System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());

			System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());

			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());

			System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());

			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		} 
		    catch (Exception e) 
		   {
		     System.out.println(e.getMessage());
		   }
		
}
}