package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwapOfClass
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		switchTowindow(driver,"flipkart");
		Point flPosition = driver.manage().window().getPosition();
		
		switchTowindow(driver,"ebay");
		Point ebPosition = driver.manage().window().getPosition();
		
		 driver.manage().window().setPosition(flPosition);
		 
		 switchTowindow(driver,"flipkart");
	      driver.manage().window().setPosition(ebPosition);
		
		     
		 
	}
	public static void switchTowindow(WebDriver driver,String expUrl) 
	{
		  Set<String> allWindowIds = driver.getWindowHandles();
			
			 for(String id:allWindowIds) 
			 {
				driver.switchTo().window(id);
				 String acturl = driver.getCurrentUrl();
				  if(acturl.contains(expUrl))
				  {
					 break;
				 }
		
			 }
	    }
    }




	

