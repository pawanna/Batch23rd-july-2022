package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException
	
	{
	    System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		
		driver.get("https://paytm.com/");
		
		//driver.close();
		
		//driver.quit();
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		
		
		
		
		
		
		
		

	}

}
