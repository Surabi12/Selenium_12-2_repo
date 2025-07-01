package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetTitle1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.instagram.com/");
	
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Instagram"))
		{
			System.out.println("welcome page is displayed");
		}
		else
		{
			System.out.println("welcome page is not displayed");
		}
		
		
	}

}
