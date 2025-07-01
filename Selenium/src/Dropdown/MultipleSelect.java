package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/sekha/OneDrive/Desktop/Dropdown.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		 Select carSel = new Select(cars);
		 carSel.selectByIndex(0);
		 carSel.selectByValue("2");
		 carSel.selectByVisibleText("Ferrari");
	}

}
