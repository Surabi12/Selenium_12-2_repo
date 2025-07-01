package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://shoppersstack.com/products_page/17");
		driver.findElement(By.id("compare")).click();
	 Set<String> allWindowIds = driver.getWindowHandles();
	
	 for(String id:allWindowIds) {
		 driver.switchTo().window(id);
		String actUrl = driver.getCurrentUrl();
		if(actUrl.contains("filpKart")) {
			break;
		}
	 }
	 driver.close();
	}
}
	 



