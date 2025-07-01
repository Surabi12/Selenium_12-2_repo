package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
			Point Position = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
			System.out.println(Position);
			System.out.println(Position.getX());
			System.out.println(Position.getY());
	}

}
