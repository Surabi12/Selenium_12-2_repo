package PraticePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnElements {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demo.vtiger.com/vtigercrm/");
	 driver.findElement(By.id("username")).click();
	 driver.findElement(By.id("password")).click();
	 
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File temp=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./src/Takescreenshot/crm.png");
	 FileHandler.copy(temp, dest);
	 
	 driver.findElement(By.linkText("Vtiger")).click(); 
		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("Customer Relationship Management"))
				break;
			
			
		}
		
		
			
		WebElement com = driver.findElement(By.partialLinkText("Company"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(com));
		Actions act = new Actions(driver);
//	com.click();
		act.moveToElement(com).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/..//p[contains(@class,'font-size-sm mb')]")).getText();
		System.out.println(text);
	
	}}
			
			
			


