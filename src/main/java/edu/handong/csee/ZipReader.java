/*//first
 * package edu.handong.csee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

public class ZipReader {

	public static void main(String[] args) {
		ZipReader zipReader = new ZipReader();
		zipReader.run(args);
	}

	public void run(String[] args) {
		//String path = args[0];
		
		readFileInZip("0001.zip"); 
		
	}

	public void readFileInZip(String path) {
		ZipFile zipFile;
		try {
			zipFile = new ZipFile(path);
			File dirFile = new File(path);
			File[] fileList = dirFile.listFiles();
			Enumeration<? extends ZipArchiveEntry> entries = zipFile.getEntries();

		    while(entries.hasMoreElements()){
		    	ZipArchiveEntry entry = entries.nextElement();
		        InputStream stream = zipFile.getInputStream(entry);
		    
		        ExcelReader myReader = new ExcelReader();
		        
		        for(String value:myReader.getData(stream)) {
		        	System.out.println(value);
		        }
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}*/


/*//second
package edu.handong.csee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

public class ZipReader {
	
	public void run(String[] args) {
		//String path = args[0];
		//readFileInZip("0001.zip"); 
		System.out.println("args::::::::"+args[1]);
		readFileInZip(args[1]);
		
 		File dirFile = new File("C:\\git\\JavaFinalProject\\data");
		File[] fileList = dirFile.listFiles();
		for(File tempFile: fileList) {
			String fileName = tempFile.getName();
			if(!(fileName.endsWith(".xls") &&fileName.startsWith("000"))) {
				continue;
			}
			
			
		} 
		//readFileInZip("0001.zip"); 
		
	}

	public void readFileInZip(String path) {
		ZipFile zipFile;
		try {
			zipFile = new ZipFile(path); //path="0001.zip"
			Enumeration<? extends ZipArchiveEntry> entries = zipFile.getEntries();
			  System.out.println(entries);
		   // while(entries.hasMoreElements()){ 
		    	ZipArchiveEntry entry = entries.nextElement();
		        InputStream stream = zipFile.getInputStream(entry);
		        ExcelReader myReader = new ExcelReader();
		        myReader.getData(stream);
		//} 	 
		    	entry = entries.nextElement();
		        InputStream stream1 = zipFile.getInputStream(entry);
		        ExcelReader myReader1 = new ExcelReader();
		        myReader.getData(stream1);
		        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(java.lang.IllegalStateException e) {
			System.out.println("ERROR make error.xls");
			e.printStackTrace();
		}
	}
} 
*/

/*package edu.handong.csee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

public class ZipReader { 
	public void run(String[] args) { 
		System.out.println("inZipReader"+args[1]+" "+args[3]);
		
		readFileInZip(args[1]);
	
// 		File dirFile = new File(args[1]);
//		File[] fileList = dirFile.listFiles();
		for(File tempFile: fileList) {
			String fileName = tempFile.getName();
			if(!(fileName.endsWith(".xls") &&fileName.startsWith("000"))) {
				continue;
			}			
		} 
		//readFileInZip("0001.zip"); 
		
	}

	public void readFileInZip(String path) {
		ZipFile zipFile;
		try {
//			path+="\0001.zip";
			//System.out.println("path  ********* "+path);
			zipFile = new ZipFile(path); //path="0001.zip" 
			
			Enumeration<? extends ZipArchiveEntry> entries = zipFile.getEntries();
			  System.out.println(entries);
		   //while(entries.hasMoreElements()){ 
		    	ZipArchiveEntry entry = entries.nextElement();
		        InputStream stream = zipFile.getInputStream(entry);
		        ExcelReader myReader = new ExcelReader();
		        myReader.getData(stream);
		//} 	 
		    	entry = entries.nextElement();
		        InputStream stream1 = zipFile.getInputStream(entry);
		        ExcelReader myReader1 = new ExcelReader();
		        myReader.getData(stream1);
		        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(java.lang.IllegalStateException e) {
			System.out.println("ERROR make error.xls");
			e.printStackTrace();
		}
	}
}*/
package edu.handong.csee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

public class ZipReader { 
	private ArrayList<String> values1 = new ArrayList<String>();
	private ArrayList<String> values2 = new ArrayList<String>();
	
	public void run(String[] args) {   
		readFileInZip(args[1]);		
	}

	public void readFileInZip(String path) {
		
		ZipFile zipFile;
		try {
//			path+="\0001.zip";  
			zipFile = new ZipFile(path); //path="0001.zip" 
			
			Enumeration<? extends ZipArchiveEntry> entries = zipFile.getEntries();
			  System.out.println(entries);
		   //while(entries.hasMoreElements()){ 
		    	ZipArchiveEntry entry = entries.nextElement();
		        InputStream stream = zipFile.getInputStream(entry);
		        ExcelReader myReader = new ExcelReader();
		        myReader.getData(stream); 		         
		        
		//} 	 
		    	entry = entries.nextElement();
		        //InputStream stream1 = zipFile.getInputStream(entry);
		    	stream = zipFile.getInputStream(entry);
		        //ExcelReader myReader1 = new ExcelReader();
		        myReader.getData(stream);
		         
		        
		        
		        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(java.lang.IllegalStateException e) { 
			e.printStackTrace();
		}
	}
}