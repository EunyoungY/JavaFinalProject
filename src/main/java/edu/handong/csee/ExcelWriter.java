/*package edu.handong.csee; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import java.util.Iterator; 
import org.apache.poi.hssf.usermodel.HSSFCell;
import edu.handong.analysis.*; 

public class ExcelWriter {
	public static void write() { 
	//	public void write(String path) { //./thear.xls  path = 읽을 파일 경로
		String path = ".\\0001result1";
		Workbook wb1 = null;
		Workbook wb2 = null;
		Workbook merged = null;
		Sheet sheet1 = null;
		Sheet sheet2 = null;
		//ArrayList<Data> readData = new ArrayList<Data>();
		
		try(OutputStream oup = new FileOutputStream(path)) {
			
//			Workbook wb = WorkbookFactory.create(oup);
//			Sheet sheet = wb.getSheetAt(0);
			
			wb1 = WorkbookFactory.create(new FileInputStream("0001result1.xlsx"));
			sheet1 = wb1.getSheetAt(0);
			wb2 = WorkbookFactory.create(new FileInputStream("0001result2.xlsx"));
			
			merged = WorkbookFactory.create(new FileInputStream("0001result1.xlsx"));
			merged.setSheetName(0, wb1.getSheetName(0));
			merged.setSheetName(1, wb2.getSheetName(0));
			merged.getSheetAt(0);
			
			FileOutputStream fileOut = new FileOutputStream("0001result1.xlsx");
			merged.write(fileOut);
			fileOut.close();
			//merged.setSheetName(0, )
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return readData;
		
	}
}











*/