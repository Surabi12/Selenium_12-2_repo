package PraticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.myntra.com/");
		
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		
	}

}
