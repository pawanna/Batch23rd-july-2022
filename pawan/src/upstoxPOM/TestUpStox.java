package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(3000);
			
			//create an object of upstoxloginPage
			UpstoxLoginPage login = new UpstoxLoginPage(driver);
			
			login.enterUserID();
			login.enterPassword();
			login.clickOnSignInButton();
			
			//create on object of upstoxPasscodepage
			Thread.sleep(1000);
			UpstoxPasscodePage passcode=new UpstoxPasscodePage(driver);
			passcode.enterPasscode();
			
			//create on object of upstoxWelcomePage
			Thread.sleep(4000);
			Upstoxwelcomepage welcome=new Upstoxwelcomepage(driver);
			welcome.clickOnnoIAmGoodButton();
			
			//create on object of upstoxHomePage
			Thread.sleep(1000);
			UpstoxHomePage home=new UpstoxHomePage(driver);
			home.validateUserId(driver);
			home.clickOnFundsButton();
			
			//create on object upstoxFundsPage
			Thread.sleep(1000);
			UpstoxFundsPage funds=new UpstoxFundsPage(driver);
			funds.checkAvailableFunds();
			home.clickonlogoutBuutton();
			

	}

}
