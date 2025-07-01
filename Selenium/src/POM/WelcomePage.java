package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//declaration
	@FindBy(linkText= "Register")
	private WebElement registerLink; //here webelement is a return type of findelement
	
	@FindBy(className="ico-login") 
	private WebElement loginLink;
	
	//initialization
	public WelcomePage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	//getters	

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
 
 }

