package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName2 {
	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver = new ChromeDriver();

            // Step 1: Go to Facebook.com
            driver.get("https://www.facebook.com");

            // Step 2: Capture and verify title
            String actualTitle = driver.getTitle();
            System.out.println("Page Title: " + actualTitle);
            if (actualTitle.contains("Facebook")) 
            {
                System.out.println("Title verification PASSED.");
            } 
            else 
            {
                System.out.println("Title verification FAILED.");
            }

            // Step 3: Click on "Contact uploading & non-users"
            driver.get("https://www.facebook.com/help/637205020878504");

            Thread.sleep(2000);

            // Step 4: Count how many headings are present (h1 to h6)
            int hc = 0;
            for (int i = 1; i <= 6; i++) 
            {
                List<WebElement> headings = driver.findElements(By.tagName("h"+i));
                hc+= headings.size();
            }

            System.out.println("Total number of headings (h1-h6): " + hc);
    }

}

