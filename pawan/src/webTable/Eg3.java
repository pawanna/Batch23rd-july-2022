package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		for(WebElement r:rows)
		{
			System.out.print(" || "+r.getText()+" || ");
			System.out.println();
			
		}
			System.out.println();
	}

}
