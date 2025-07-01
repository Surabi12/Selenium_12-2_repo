package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./TextData/Commondata.properties");
		
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String URL = prop.getProperty("url");
		System.out.println(URL);
		String Email = prop.getProperty("email");
		System.out.println(Email);
		String Password = prop.getProperty("password");
		System.out.println(Password);
		
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		   driver.get(URL);
		   driver.findElement(By.linkText("Log in")).click();
		   driver.findElement(By.id("Email")).sendKeys(Email);
		   driver.findElement(By.id(Password)).sendKeys(Password);
		
		
	}
}
