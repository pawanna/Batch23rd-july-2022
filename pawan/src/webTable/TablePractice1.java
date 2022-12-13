package webTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice1 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		driver.manage().window().maximize();
		driver.get("https://www.cardekho.com/cars/Tata");
		Thread.sleep(1000);

	}

}
