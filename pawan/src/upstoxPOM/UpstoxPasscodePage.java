package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage
{
	//variable declaration
	
	@FindBy(name="yob") private WebElement passcodeField;
	
	//initialize variable
	
	public UpstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void enterPasscode()
	{
		passcodeField.sendKeys("1995");
	}

}
