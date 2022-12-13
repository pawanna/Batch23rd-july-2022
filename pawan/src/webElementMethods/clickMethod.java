package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethod {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
         
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkBoxOption1 = driver.findElement(By.id("checkBoxOption1"));
		checkBoxOption1.click();
		
		 WebElement checkBoxOption2 = driver.findElement(By.id("checkBoxOption2"));
		checkBoxOption2.click();
		
		WebElement checkBoxOption3 = driver.findElement(By.id("checkBoxOption3"));
		checkBoxOption3.click();
		
		

	}

}
