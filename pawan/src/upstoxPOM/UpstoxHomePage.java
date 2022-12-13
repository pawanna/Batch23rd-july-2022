package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import screenShot.Scrolling;

public class UpstoxHomePage
{
    @FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userId;
    @FindBy(id = "funds") private WebElement fundsButton;
    @FindBy(xpath = "//div[text()='Logout']") private WebElement logoutBUtton;
    
    public UpstoxHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void validateUserId(WebDriver driver) throws InterruptedException
    {
    	Thread.sleep(1000);
    	Scrolling.scrollIntoView(driver, userId);
    	
    	String actulUserId = userId.getText();
    	String ExpectedId="pawan n.";
    	
    	if(actulUserId.equalsIgnoreCase(ExpectedId))
    	{
    		System.out.println("Actual and Expected UserId are Mathching, TC is Passed");
    	}
    	else
    	{
         System.out.println("Actual and Expected UserId are Mathching, TC is failed");
    	}
    }

	public void clickOnFundsButton()
	{
		fundsButton.click();
	}
		
	public void clickonlogoutBuutton() throws InterruptedException
	{
		userId.click();
		Thread.sleep(500);
		logoutBUtton.click();
	}
	
}
