package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'App')]"));
		
		String actualResult = text.getText();
		System.out.println("Actual result is "+actualResult);
		
		String expectedResult="India's Most-loved Payments App";
		
		if(actualResult.equals(expectedResult))
		{
			System.out.println("Result is Matching, TC is passed");
		}
		else
		{
			System.out.println("Result is not-Matching, TC is failed");
		}
		
	}

}
