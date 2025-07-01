package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectedOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/sekha/OneDrive/Desktop/Dropdown.html");
		WebElement cars = driver.findElement(By.id("cars"));
		 Select carSel = new Select(cars);
		 carSel.selectByIndex(0);
		 carSel.selectByIndex(2);
		 
		// WebElement firstselected = carSel.getFirstSelectedOption();
		// System.out.println(firstselected.getText());
		 
		 
		 List<WebElement> allSelectopt = carSel.getAllSelectedOptions();
		 System.out.println(allSelectopt.size());
		 for(WebElement ele:allSelectopt) {
			 System.out.println(ele.getText());
		 }
		 System.out.println(carSel.isMultiple());
		
	}

}
