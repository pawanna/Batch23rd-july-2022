package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/home");
		driver.manage().window().maximize();
         Thread.sleep(9000);
         driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
         Thread.sleep(9000);
       WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
       Thread.sleep(9000);
       boolean result1 = getOTPButton.isEnabled();
       
       System.out.println("Get OTP Button is "+result1);
       driver.findElement(By.id("mobileNumber")).sendKeys("9767713031");
       Thread.sleep(9000);
       
      boolean result2 = getOTPButton.isEnabled();
      Thread.sleep(9000);
      
      System.out.println("Get OTP Button is "+result2);
      Thread.sleep(9000);
      
      //getOTPButton.click();
      
     
      
      
       
         
         
         
         
         
	}

}
