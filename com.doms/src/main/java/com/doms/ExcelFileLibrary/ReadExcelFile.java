package com.doms.ExcelFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.doms.GenericLibrary.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {
	public  FileInputStream fis=null;
	public  Workbook wb=null;
	public  FileOutputStream fos=null;
	
	
	public  String readSingleData(String sheet,int row, int column) {
		//1.convert physical into java readable file
		try {
			fis=new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2.create a workbook using workbook factory
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb.getSheet("RegisterData").getRow(2).getCell(1).getStringCellValue();
	}
public  void readMultileData(int row, int column) {
	//1.convert physical into java readable file
			try {
				fis=new FileInputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//2.create a workbook using workbook factory
			try {
				wb=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//3.using workbook Get the Sheet Control
			//4.using sheet get row control
			//5.using row get the cell/column control
			//6.using column get the Cell data
			int rowcount=wb.getSheet("Sheetname").getLastRowNum();
			for(int i=1;i<rowcount;i++)
			{
			
			wb.getSheet("Sheetname").getRow(i).getCell(1).getStringCellValue();
			}
		
	}
public  void writeData(String sheetname,int row, int cell,String data) {
	//1.convert physical into java readable file
			try {
				fis=new FileInputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//2.create a workbook using workbook factory
			try {
				wb=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//3.using workbook Get the Sheet Control
			//4.using sheet get row control
			//5.using row get the cell/column control
			//6.using col set cell
			wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
	//7.convert java readable file into physical file
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//8.write the data
			try {
				wb.write(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//9.close the workbook
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
}
