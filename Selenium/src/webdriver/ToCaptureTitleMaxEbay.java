package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleMaxEbay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			 String url = driver.getCurrentUrl();
			 if(url.equals("https://www.amazon.in/")){
				 System.out.println(driver.getTitle());
		     }else if(url.equals("https://www.amazon.in/")){
		     driver.manage().window().maximize();
			
			 
			
			}
		}
	}
}
		
		
	




