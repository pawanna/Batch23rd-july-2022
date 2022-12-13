package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.phonepe.com/");
		
		Thread.sleep(1100);
		
		driver.navigate().back();
		
		Thread.sleep(1100);
		
		driver.navigate().forward();
		
		Thread.sleep(1100);
		
		driver.navigate().refresh();
		
		
		
			
	}

}
