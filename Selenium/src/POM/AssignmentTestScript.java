package POM;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomMiniProject.RegisterId;



public class AssignmentTestScript {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		FileInputStream fis1=new FileInputStream("./src/TextData/Commondata.properties");
		Properties prop = new Properties(); 
		prop.load(fis1);
		String url= prop.getProperty("url");
		System.out.println(url);
		
		driver.get(url);
		
		RegisterId rp = new RegisterId(driver);
		rp.getRegisterLink().click();
		rp.getMaleRadioButton().click();
		
	
		FileInputStream fis=new FileInputStream("./src/TextData/TextScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		String firstname = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(firstname);
		rp.getFirstnameTextField().sendKeys(firstname);
		
		String lastname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastname);
		rp.getLastnameTextField().sendKeys(lastname);
		
		String email = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(email);
		rp.getEmailTextField().sendKeys(email);
		
		String password = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(password);
		rp.getPasswordTextField().sendKeys(password);
		
		String confirmpassword = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		System.out.println(confirmpassword);
		rp.getConfirmPasswordTextField().sendKeys(confirmpassword);
		
	}
	}



