package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
         
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Actions act =new Actions(driver);
		
        WebElement firstname = driver.findElement(By.name("firstname"));
		
		Thread.sleep(500);
		
		//act.moveToElement(firstname).sendKeys("Pawan").build().perform();
		
		act.moveToElement(firstname).keyDown("P").keyUp(Keys.SHIFT).sendKeys("awan").build().perform();
		act.click(month).perform();
		Thread.sleep(500);
		
		for(int i=0; i<=7; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
