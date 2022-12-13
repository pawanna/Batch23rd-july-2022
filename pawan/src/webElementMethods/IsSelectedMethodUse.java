package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		boolean result1 = checkBox1.isSelected();
		
		System.out.println("check box status is "+result1);
		 
		checkBox1.click();
		
     boolean result2 = checkBox1.isSelected();
     System.out.println("Check box selection is "+result2);
     checkBox1.click();
     
     
         

	}

}
