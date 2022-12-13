package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
        
		WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
		
		Select s=new Select(dropDown);
		
		s.selectByVisibleText("Option3");
		Thread.sleep(1000);
		s.selectByIndex(2);
		
		s.selectByValue("option1");
	}

}
