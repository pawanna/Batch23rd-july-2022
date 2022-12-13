package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base
{
	protected WebDriver driver;
  public void launchBrowser()
  {System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://neostox.com/sign-in");
	Reporter.log("Launching Browser", true);
	
	
  }
   public static void closingBrowser(WebDriver driver) throws InterruptedException
   {
	   Reporter.log("closing browser", true);
	   Thread.sleep(500);
	   driver.close();
   }



}
