/*package edu.handong.csee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import java.util.Iterator;

public class ExcelReader { 
	public ArrayList<String> getData(String path) {
		ArrayList<String> values = new ArrayList<String>();
		
		System.out.println(path);
		
		try (InputStream inp = new FileInputStream(path)) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);
		        
		        Row row = sheet.getRow(2);
		        Cell cell = row.getCell(1);
		        if (cell == null)
		            cell = row.createCell(3);
		        
		        values.add(cell.getStringCellValue());
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	while(rowIterator.hasNext()) {
		    		Row row = rowIterator.next();
		    		Iterator<Cell> cellIterator = row.cellIterator();
		    		
		    		while(cellIterator.hasNext()) {
		    			Cell cell = cellIterator.next();
		    			values.add(cell.getStringCellValue());
		    			System.out.print(cell.getStringCellValue() + "t");	
		    			}
		    		}
		        
		    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return values;
	}
	 
	
	public ArrayList<String> getData(InputStream is) {
		ArrayList<String> values = new ArrayList<String>();
		
		try (InputStream inp = is) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		    System.out.println("**************************");
		    System.out.println(inp);
		        Workbook wb = WorkbookFactory.create(inp); 
		        Sheet sheet = wb.getSheetAt(0); 
		 
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	while(rowIterator.hasNext()) {
		    		Row row = rowIterator.next();
		    		Iterator<Cell> cellIterator = row.cellIterator();
		    		
		    		while(cellIterator.hasNext()) {
		    			Cell cell = cellIterator.next();
		    			values.add(cell.getStringCellValue()); 
		    			FileOutputStream output = new FileOutputStream("C:\\git\\JavaFinalProject\\result1.xlsx");
		    			wb.write(output);  
		    			 	 
//		    			FileOutputStream fileOut = new FileOutputStream("C:\\git\\JavaFinalProject\\result2.xlsx");
//		    			wb.write(fileOut);
//		    			fileOut.close();
		    			 	  
		    			System.out.print(cell.getStringCellValue() + "t");	
		    			}	
		    		}   
    			FileOutputStream fileOut = new FileOutputStream("C:\\git\\JavaFinalProject\\result2.xlsx");
    			wb.write(fileOut);
    			fileOut.close();
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		return values;
	} 
}*/


/*
package edu.handong.csee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	public ArrayList<String> getData(String path) {
		ArrayList<String> values = new ArrayList<String>();
		
		System.out.println(path);
		
		try (InputStream inp = new FileInputStream(path)) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		    
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);
		        Row row = sheet.getRow(2);
		        Cell cell = row.getCell(1);
		        if (cell == null)
		            cell = row.createCell(3);
		        
		        values.add(cell.getStringCellValue());
		        
		    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return values;
	}
	
	public ArrayList<String> getData(InputStream is) {
		ArrayList<String> values = new ArrayList<String>();
		
		try (InputStream inp = is) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		    	int rowNum=0, colNum=0;
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);
		        Row row = sheet.getRow(2);
		        Cell cell = row.getCell(1);
		        if (cell == null)
		            cell = row.createCell(3);
		        
		        values.add(cell.getStringCellValue());
		        
		    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return values;
	}
}*/


/*second
package edu.handong.csee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import java.util.Iterator;

public class ExcelReader { 
	int i=0;
	public ArrayList<String> getData(String path) {
		ArrayList<String> values = new ArrayList<String>();
		
		System.out.println(path);
		
		try (InputStream inp = new FileInputStream(path)) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		    
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);
		        Row row = sheet.getRow(2);
		        Cell cell = row.getCell(1);
		        if (cell == null)
		            cell = row.createCell(3);
		        
		        values.add(cell.getStringCellValue());
		        
		    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return values;
	} 
	
	public ArrayList<String> getData(InputStream is) {
		ArrayList<String> values = new ArrayList<String>(); 
		
		try (InputStream inp = is) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
			//System.out.println(inp);
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0); 
		 
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	while(rowIterator.hasNext()) {
		    		Row row = rowIterator.next();
		    		Iterator<Cell> cellIterator = row.cellIterator();
		    		
		    		while(cellIterator.hasNext()) {
		    			Cell cell = cellIterator.next();
		    			values.add(cell.getStringCellValue());
		    			//System.out.println(cell.getStringCellValue() + "t");	
		    			}
		    		}  
		    		if(i==0) {
				    	FileOutputStream fileOut = new FileOutputStream("C:\\git\\JavaFinalProject\\result1.xlsx");
				    	wb.write(fileOut);
				    	fileOut.close(); 
				    	i++;
		    		} 
			    	if(i>0) { 
				    	FileOutputStream fileOut2 = new FileOutputStream("C:\\git\\JavaFinalProject\\result2.xlsx");
				    	wb.write(fileOut2);
				    	fileOut2.close(); 			    		
			    	} 
		    	
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		return values;
	} 
}
 */
/*package edu.handong.csee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import edu.handong.analysis.*;

public class ExcelReader { 
	int i=0; 
	public ArrayList<String> getData(String path) {
		ArrayList<String> values = new ArrayList<String>();
		
		System.out.println(path);
		
		try (InputStream inp = new FileInputStream(path)) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		    
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);
		        Row row = sheet.getRow(2);
		        Cell cell = row.getCell(1);
		        if (cell == null)
		            cell = row.createCell(3);
		        
		        values.add(cell.getStringCellValue());
		        
		    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return values;
	} 
	
	public ArrayList<String> getData(InputStream is) {
		ArrayList<String> values = new ArrayList<String>(); 
		
		try (InputStream inp = is) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
			//System.out.println(inp);
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);  
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	while(rowIterator.hasNext()) {
		    		Row row = rowIterator.next();
		    		Iterator<Cell> cellIterator = row.cellIterator();
		    		
		    		while(cellIterator.hasNext()) {
		    			Cell cell = cellIterator.next();
		    			
		    			switch(cell.getCellType()) {
		    			case NUMERIC:  
		    				values.add(String.valueOf(cell.getNumericCellValue())); 
	                        break;
		    			case STRING: 
		    				values.add(cell.getStringCellValue()); 
	                        break; 
		    			} 	
		    		}
		    	}  
		    		if(i==0) {
				    	//FileOutputStream fileOut = new FileOutputStream(folder+Analyzer.getNum()+"result1.xlsx");
				    	FileOutputStream fileOut = new FileOutputStream("000"+Analyzer.getNum()+"result1.xlsx");
				    	Row row=sheet.createRow(0);
				    	row.createCell(0).setCellValue("000"+Analyzer.getNum());
				    	wb.write(fileOut);
				    	fileOut.close(); 
				    	i++;
		    		} 
			    	if(i>0) { 
			    		FileOutputStream fileOut2 = new FileOutputStream("000"+Analyzer.getNum()+"result2.xlsx");
				    	//FileOutputStream fileOut2 = new FileOutputStream("C:\\git\\JavaFinalProject\\result2.xlsx");
				    	Row row=sheet.createRow(0);
				    	row.createCell(0).setCellValue("000"+Analyzer.getNum());
			    		wb.write(fileOut2);
				    	fileOut2.close(); 			    		
			    	} 
		    	
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			//*******************폴더에다 넣기, 근데 폴더 없을 때, 폴더 만들기
			//customized exception !!!!!!!!!!!!!!!!
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
		return values;
	} 
}*/

package edu.handong.csee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import edu.handong.analysis.*;

public class ExcelReader { 
	int i=0; 
	//public ArrayList<String> getData(String path) {
	public ArrayList<Data> getData(String path) {
		ArrayList<Data> values = new ArrayList<Data>();
		
		System.out.println(path);
		
		try (InputStream inp = new FileInputStream(path)) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
		    
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);
		        Row row = sheet.getRow(2);
		        Cell cell = row.getCell(1);
		        if (cell == null)
		            cell = row.createCell(3);
		        
		        //values.add(cell.getStringCellValue());
		        
		    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return values; 
	} 
	
	public Data<String> getData(InputStream is) {
		Data<String> values = new Data<String>(); 
		
		try (InputStream inp = is) {
		    //InputStream inp = new FileInputStream("workbook.xlsx");
			//System.out.println(inp);
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);  
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	while(rowIterator.hasNext()) {
		    		Row row = rowIterator.next();
		    		Iterator<Cell> cellIterator = row.cellIterator();
		    		
		    		while(cellIterator.hasNext()) {
		    			Cell cell = cellIterator.next();
		    			
		    			switch(cell.getCellType()) {
		    			case NUMERIC:  
		    				values.add(String.valueOf(cell.getNumericCellValue()));    
	                        break;
		    			case STRING: 
		    				values.add(cell.getStringCellValue());  
	                        break; 
		    			} 	
		    		}
		    	}  
		    	FileOutputStream fileOut;
		    		if(i==0) {
				    	//FileOutputStream fileOut = new FileOutputStream(folder+Analyzer.getNum()+"result1.xlsx");
				    	fileOut = new FileOutputStream("000"+Analyzer.getNum()+"result1.xlsx");
				    	Row row=sheet.createRow(0);
				    	row.createCell(0).setCellValue("000"+Analyzer.getNum());
				    	wb.write(fileOut);
				    	fileOut.close(); 
				    	i++;
		    		} 
			    	if(i>0) { 
			    		FileOutputStream fileOut2 = new FileOutputStream("000"+Analyzer.getNum()+"result2.xlsx");
				    	//FileOutputStream fileOut2 = new FileOutputStream("C:\\git\\JavaFinalProject\\result2.xlsx");
				    	Row row=sheet.createRow(0);
				    	row.createCell(0).setCellValue("000"+Analyzer.getNum());
			    		wb.write(fileOut2);
				    	fileOut2.close(); 			    		
			    	} 
		    	
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			//*******************폴더에다 넣기, 근데 폴더 없을 때, 폴더 만들기
			//customized exception !!!!!!!!!!!!!!!!
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return values;
	} 
	
	/*public HashMap<Workbook, String> getData1(InputStream is) {
		HashMap<Workbook, String> values = new HashMap<Workbook, String>(); 
		
		try (InputStream inp = is) { 
		        Workbook wb = WorkbookFactory.create(inp);
		        Sheet sheet = wb.getSheetAt(0);  
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	while(rowIterator.hasNext()) {
		    		Row row = rowIterator.next();
		    		Iterator<Cell> cellIterator = row.cellIterator();
		    		
		    		while(cellIterator.hasNext()) {
		    			Cell cell = cellIterator.next();
		    			
		    			switch(cell.getCellType()) {
		    			case NUMERIC:  
		    				values.put(wb,String.valueOf(cell.getNumericCellValue())); 
		    				//ZipReader.values1.add(String.valueOf(cell.getNumericCellValue())); 
		    				
		    				values.put(wb,String.valueOf(cell.getNumericCellValue())); 
	                        break;
		    			case STRING: 
		    				values.put(wb,cell.getStringCellValue()); 
		    				//ZipReader.values1.add(String.valueOf(cell.getNumericCellValue())); 
		    				
		    				values.put(wb,cell.getStringCellValue()); 
	                        break; 
		    			} 	
		    		}
		    	}   
		    	
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} 
//		return values;
		return values;
	} */
}