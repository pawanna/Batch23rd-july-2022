package studyOfTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestNG {
  @Test
  public void googleTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//Thread.sleep(35000);
  }
  @Test
  public void facebookTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(35000);
  }
}
