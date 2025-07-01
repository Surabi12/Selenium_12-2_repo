package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;            
import org.openqa.selenium.support.ui.Select;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		WebElement PhoneNo = driver.findElement(By.id("PhoneNo"));
		  Select PhoneNoSel = new Select(PhoneNo);
		 List<WebElement> alloptions = PhoneNoSel.getOptions();
		 System.out.println(alloptions.size());
		 
		 
		 for(WebElement ele:alloptions) {
			 System.out.println(ele.getText());
		 }
		
	}

}

		
	
