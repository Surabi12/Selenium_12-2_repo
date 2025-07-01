package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnStaleElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/");
	
	MyntraPage mypage=new MyntraPage(driver);
	
	
	mypage.getSearchTextField().sendKeys("mobiles",Keys.ENTER);
	mypage.getSearchTextField().sendKeys("shoes");
	
}

}
