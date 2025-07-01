package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup1 {
	public static void main(String[] args) {
		
	

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/17");
	driver.findElement(By.id("compare")).click();
	
	switchToWindow(driver,"amazon");
	System.out.println(driver.getTitle());
	switchToWindow(driver,"shoppersstack");
	driver.close();
	switchToWindow(driver,"filpKart");
	driver.close();
	
	

}
	public static void switchToWindow(WebDriver driver,String expUrl) {
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String id:allWindowIds) {
		driver.switchTo().window(id);
		driver.close();
	}
}
}