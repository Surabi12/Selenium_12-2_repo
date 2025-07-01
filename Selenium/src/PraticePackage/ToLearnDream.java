package PraticePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnDream {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		

		driver.get("https://www.dream11.com/");

		driver.switchTo().frame(driver.findElement(By.id("send-sms-iframe")));

		driver.findElement(By.id("regEmail")).sendKeys("944867");

		

		driver.findElement(By.id("regUser")).click();

		

		String text = driver.findElement(By.id("errorMob")).getText();

		System.out.println("error message captured : "+ text);

	

		driver.switchTo().defaultContent();

	
		

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,5000)", true);

		

		Thread.sleep(1000);

		

		driver.findElement(By.linkText("About Us")).click();

	

		Set<String> allwin = driver.getWindowHandles();

		 for(String id:allwin)

		 {

			 driver.switchTo().window(id);

			String url = driver.getCurrentUrl();

	

			if(url.contains("https://www.dreamsports.group/"))

			{

				break;

				

			}

			

		 }

		driver.findElement(By.partialLinkText("Dream Responsibly")).click();

		Set<String> allwin1 = driver.getWindowHandles();

		for(String id:allwin1)

		 {

			 driver.switchTo().window(id);

			String url = driver.getCurrentUrl();

		

			if(url.contains("https://www.dreamsports.group/dream-responsibly/"))

			{

				break;

				

			}

			

		 }

		driver.findElement(By.linkText("Dream Stories")).click();

		Thread.sleep(1000);

	 String time = LocalDateTime.now().toString().replace(":", "-");

	 TakesScreenshot ts=(TakesScreenshot) driver;

	 File temp = ts.getScreenshotAs(OutputType.FILE);

	 File dest=new File("./src/takeScreenShot/"+time+".png");

	 FileHandler.copy(temp, dest);
	}

}
