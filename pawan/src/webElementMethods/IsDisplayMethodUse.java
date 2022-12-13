package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
        
        WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        
       showButton.click();
       if( textBox.isDisplayed())
       {
    	   textBox.sendKeys("Good Morning");  
    	   Thread.sleep(2000);
       }
       else
       {
    	   showButton.click();
    	   textBox.sendKeys("good evining");
       }
        
         
      

	}

}
