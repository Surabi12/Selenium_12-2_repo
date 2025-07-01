package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("RAM");
		driver.findElement(By.id("LastName")).sendKeys("CHARAN");
		driver.findElement(By.id("Email")).sendKeys("ram@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ram@2020");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ram@2020");
		driver.findElement(By.id("register-button")).click();

		
	}

}


