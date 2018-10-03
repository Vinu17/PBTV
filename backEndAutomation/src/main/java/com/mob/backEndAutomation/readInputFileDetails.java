package com.mob.backEndAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readInputFileDetails {

	public static void main(String[] args) {
		readInputFileDetails rd= new readInputFileDetails();
		rd.putDataIntoMap();
		
		

//		try {
//
//			File f = new File("C://Users//DISH2//Desktop//Selenium//TestDataSheet.xlsx");
//			if(f.exists()) {
//				
//			System.out.println("Data is present started data reading");
//			FileInputStream fis = new FileInputStream(f);
//			XSSFWorkbook wb = new XSSFWorkbook(fis);
//			XSSFSheet sh=wb.getSheet("Set1");
//			
//			for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
//				for(int j=0;j<sh.getRow(i).getPhysicalNumberOfCells();j++) {
//
//					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
//				}
//			}
//			
//			}
//			else {
//				System.out.println("data does not exit");
//			}
//		} 
//			catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void putDataIntoMap() {
		try {
			HashMap<Integer,String> mp= new HashMap<Integer,String>();
			mp.put(1, "Vineet");
			mp.put(2, "Bittu");
			mp.put(3, "kaho");
			System.out.println("===================");
			System.out.println(mp.get(2));
			for(Entry m: mp.entrySet()) 
			{
			System.out.println(m.getKey()+" "+m.getValue());	
			}
			
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	}
