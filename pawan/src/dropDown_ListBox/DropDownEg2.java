package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
        
		WebElement cars= driver.findElement(By.id("cars"));
		
		Select s=new Select(cars);
		
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		
		s.selectByValue("saab");
		
		System.out.println("1st selection is done of "+s.getFirstSelectedOption().getText());
	}

}
