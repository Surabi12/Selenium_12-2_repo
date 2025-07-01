package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAssignment {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Books")).click();
		
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select sortBySel = new Select(sortBy);
		sortBySel.selectByIndex(2);

		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select displaySel = new Select(display);
		displaySel.selectByValue("12");
		
		WebElement viewAs = driver.findElement(By.id("products-viewmode"));
		Select viewAsSel = new Select(viewAs);
		viewAsSel.selectByVisibleText("Grid");
	}

	}


