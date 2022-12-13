package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(); //created object of chrome driver
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			//Thread.sleep(35000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(35000));

	}

}
