package desiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
        // Create object of ChromeOption
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//opt.addArguments("incongito");
		//Thread.sleep(1000);
		//opt.addArguments("start-maximized");
		//opt.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.justdial.com/");
		//driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
