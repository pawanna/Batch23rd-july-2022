package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		System.out.println(driver.getTitle());
		
		String MyTitle=driver.getTitle();
		
		System.out.println("My title is"+MyTitle);
		
		
		System.out.println(driver.getCurrentUrl());
		
		String myUrl =driver.getCurrentUrl();
		
		System.out.println("My url is "+ myUrl);

	}

}
