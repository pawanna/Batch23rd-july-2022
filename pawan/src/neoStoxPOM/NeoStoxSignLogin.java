package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignLogin
{
     @FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobilenumberFiled;
     @FindBy(xpath = "//a[@id=\"lnk_signup1\"]") private WebElement signInButton;
     
     public NeoStoxSignLogin(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
    	 
     }
     public void sendMobileNum(String mobNum)
     {
    	 mobilenumberFiled.sendKeys(mobNum);
    	 Reporter.log("sending mobile number", true);
     }
     
     public void clickOnSignInButton()
     {
    	 signInButton.click();
     }
}
