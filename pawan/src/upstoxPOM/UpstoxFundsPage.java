package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UpstoxFundsPage
{
    @FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")private WebElement AvailableFunds;
    
    public UpstoxFundsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void checkAvailableFunds()
    {
    	String myfunds = AvailableFunds.getText();
    	
    	System.out.println("funds availablE to trade is "+myfunds);
    	
    }
    
}
