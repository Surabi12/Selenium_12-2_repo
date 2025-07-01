package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;

public class ReadDataFromExcel {


public static void main(String[] args) throws EncryptionException, IOException {
	
	
//step 1:create FileInputStream object
	FileInputStream fis=new FileInputStream("./TextData/TestScriptData.xlsx");
//step2:create repective file type object	
	
	
//step3:call read methods
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
	
	int price = (int)wb.getSheet("sheet1").getRow(1).getCell(3).getNumericCellValue();
	System.out.println(price);
	
	 boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
	 System.out.println(status);
	 
	LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();//print entire date month n day
	System.out.println(date.getDayOfMonth());//print on day of the month
	System.out.println(date.getMonth());//print only month
	System.out.println(date.getYear());//print only date
	
	
}

}
                                                                         
 