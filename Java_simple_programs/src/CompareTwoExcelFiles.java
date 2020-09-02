
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CompareTwoExcelFiles {

 public static void main(String[] args) {
        try {
            // get input excel files
         System.out.println("Welcome");
            FileInputStream excellFile1 = new FileInputStream(new File("C:/Users/SURYA/Desktop/Book1.xlsx"));
            FileInputStream excellFile2 = new FileInputStream(new File("C:/Users/SURYA/Desktop/Book2.xlsx"));

            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
            XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);

            // Get first/desired sheet from the workbook
            XSSFSheet sheet1 = workbook1.getSheetAt(0);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);

            // Compare sheets
            if(compareTwoSheets(sheet1, sheet2)) {
                System.out.println("\n\nThe two excel sheets are Equal");
            } else {
                System.err.println("\n\nThe two excel sheets are Not Equal");
            }
           
            //close files
            excellFile1.close();
            excellFile2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

 private static boolean compareTwoSheets(XSSFSheet sheet1, XSSFSheet sheet2) {
  // TODO Auto-generated method stub
	 	int firstRow1 = sheet1.getFirstRowNum();
         int lastRow1 = sheet1.getLastRowNum();
         int rowCount1 = sheet1.getLastRowNum();
    	 int rowCount2 = sheet2.getLastRowNum();
    	 
    	 System.out.println(rowCount1+ " " + rowCount2);
    	 
         boolean equalSheets = false;
         if(rowCount1 == rowCount2)
         {
         
         for(int i=0; i <= rowCount1+1; i++) {
           
             System.out.println("\n\nComparing Row "+i);
           
             XSSFRow row1 = sheet1.getRow(i);
             XSSFRow row2 = sheet2.getRow(i);
             			
				  if(!compareTwoRows(row1, row2)) { 
					  
					  System.err.println("Row "+i+" - Not Equal"); 
					  equalSheets =  false; 
					  break; } 
				  else {
			  System.out.println("Row "+i+" - Equal"); 
			  equalSheets =  true; 
			  }
			  }
			 
         }
         return equalSheets;
 }

 private static boolean compareTwoRows(XSSFRow row1, XSSFRow row2) {
  // TODO Auto-generated method stub
	 
	
   if((row1 == null) && (row2 == null)) {
             return true;
         } else if((row1 == null) || (row2 == null)) {
             return false;
         }
       
         int firstCell1 = row1.getFirstCellNum();
         int lastCell1 = row1.getLastCellNum();
         boolean equalRows = true;
       
         // Compare all cells in a row
         for(int i=firstCell1; i <= lastCell1; i++) {
             XSSFCell cell1 = row1.getCell(i);
             XSSFCell cell2 = row2.getCell(i);
             if(!compareTwoCells(cell1, cell2)) {
                 equalRows = false;
                 System.err.println("       Cell "+i+" - NOt Equal");
                 break;
             } else {
                 System.out.println("       Cell "+i+" - Equal");
             }
         }
         return equalRows;
 }

 public static boolean compareTwoCells(XSSFCell cell1, XSSFCell cell2) {
     if((cell1 == null) && (cell2 == null)) {
         return true;
     } else if((cell1 == null) || (cell2 == null)) {
         return false;
     }
     
     boolean equalCells = false;
     CellType type1 = cell1.getCellType();
     CellType type2 = cell2.getCellType();
     if (type1 == type2) {
         if (cell1.getCellStyle().equals(cell2.getCellStyle())) {
             // Compare cells based on its type
            
                 if (cell1.getStringCellValue().equals(
                         cell2.getStringCellValue())) {
                     equalCells = true;
                 }
         } else {
             return false;
         }
     } else {
         return false;
     }
     return equalCells;
 }
}
