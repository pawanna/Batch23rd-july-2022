package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextuse {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
         
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String actualResult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		System.out.println("Actual String is "+actualResult);
		
		

	}

}
