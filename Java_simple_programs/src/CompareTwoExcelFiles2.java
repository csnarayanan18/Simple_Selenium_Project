
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CompareTwoExcelFiles2 {

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
            
            int rowCount1 = sheet1.getLastRowNum();
            int rowCount2 = sheet2.getLastRowNum();
       	 
       	 System.out.println(rowCount1+ " " + rowCount2);
       	 
         //   boolean equalSheets = false;
            if(rowCount1 == rowCount2)
            {
            
            for(int i=0; i <= rowCount1; i++) {
              
                System.out.println("\n\nComparing Row "+i);
              
                XSSFRow row1 = sheet1.getRow(i);
                XSSFRow row2 = sheet2.getRow(i);
                
              //  boolean equalRows = true;
                
                int cellCount1 = row1.getLastCellNum();
                int cellCount2 = row2.getLastCellNum();
                int firstCell1 = row1.getFirstCellNum();
                
                System.out.println(cellCount1+ " " + cellCount2);
              
                // Compare all cells in a row
                for(int j=firstCell1; j < cellCount1; j++) {
                    XSSFCell cell1 = row1.getCell(j);
                    XSSFCell cell2 = row2.getCell(j);
                                        
                    CellType type1 = cell1.getCellType();
                    CellType type2 = cell2.getCellType();
                    if (type1 == type2) {
                        if (cell1.getCellStyle().equals(cell2.getCellStyle())) {
                            // Compare cells based on its type
                        	
                        	System.out.println(cell1.getStringCellValue() + " " + cell2.getStringCellValue());
                           
                                if (cell1.getStringCellValue().equals(cell2.getStringCellValue())) {
                                	//System.out.println("Maatches");
                                    //equalCells = true;
                                }
                         else {
                        	System.err.println("not Maatches");
                            //return false;
                        }
                    } else {
                        //return false;
                    }
                    }
                    else
                    {
                    	
                    }
   			  //equalSheets =  true; 
                    
   			  }
   			  }
   			 
            }
            else
            {
            	System.out.println("Error");
            }
            //close files
            excellFile1.close();
            excellFile2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
