package upstoxPOM;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpstoxLoginPage
{
	//variable declaration 
	@FindBy(name="userId") private WebElement userID;
	
	@FindBy(name="password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	//initialize using constructor-->uses-->(method)--->initElements
	public  UpstoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//variable usage using method
	public void enterUserID()
	{
		userID.sendKeys("2VBQH5");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Pawan@123");
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
	
	
	
	
	
	
	

}
