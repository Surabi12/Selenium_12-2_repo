package Dropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		                                                                           
		driver.get("https://www.facebook.com/reg");
		WebElement month = driver.findElement(By.id("month"));
		Select monthSel=new Select(month);
		 monthSel.selectByIndex(0);
		//monthSel.selectByValue("10");
		//monthSel.selectByVisibleText("Jul");
		
	}

}
