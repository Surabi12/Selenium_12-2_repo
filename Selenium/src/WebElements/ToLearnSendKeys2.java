package WebElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys2 {
	
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/");


	driver.findElement(By.linkText("Vtiger")).click();
	//
	Set<String> handle = driver.getWindowHandles();
	for(String s:handle)
	{
	driver.switchTo().window(s);

	String url = driver.getCurrentUrl();
	System.out.println(url);


	if(url.equals("https://www.vtiger.com/"))
	{

	break;
	}


	}

	// String win = driver.getWindowHandle();
	// driver.switchTo().window(win);
	driver.findElement(By.xpath("//span[@id='loginspan']")).click();

	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testing@gmail.com");
	driver.findElement(By.name("password")).sendKeys("12345");
	driver.findElement(By.xpath("//button[text()='Sign in']")).submit();

	String errormsg = driver.findElement(By.xpath("//p[@id='com-form-login-error']")).getText();
	System.out.println("Error Message " +errormsg);

	String color = driver.findElement(By.xpath("//p[@id='com-form-login-error']")).getCssValue("color");
	System.out.println("Color of Error Message " +color);


	String bgcolor = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("background-color");
	System.out.println("background Color of sign in " +bgcolor);

	Thread.sleep(5000);
	driver.quit();

	

	}

}




