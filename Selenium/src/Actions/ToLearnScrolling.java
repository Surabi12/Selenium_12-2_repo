package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {
	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.redbus.in/");
		  
		  WebElement bookTrain = driver.findElement(By.linkText("Book Train Tickets"));
		  Actions act=new Actions(driver);
		  act.scrollToElement(bookTrain).perform();
		 // act.scrollByAmount(1182,519).perform();
		  
		  
	}

	

}
