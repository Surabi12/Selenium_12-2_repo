package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {

	@Test(priority=1)
	public void register() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register Succesfully",true);
	}

	@Test(priority=1)
	public void login() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Logged in Succesfully",true);
	}
}
