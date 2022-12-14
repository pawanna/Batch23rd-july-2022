package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(); //created object of chrome driver
			driver.manage().window().maximize();
			driver.get("https://www.discoveryplus.in/");
			//Thread.sleep(35000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
			
			WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(4000));
			
	        WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
			
			w.until(ExpectedConditions.visibilityOf(signInButton));
			
			signInButton.click();
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
