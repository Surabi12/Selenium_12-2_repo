package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborgini {

	@Test(groups="integration")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lamborghinistore.com/row/");
		Reporter.log("Lamborgini launched",true);
	}

}
