package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPops {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();//switching selenium focus main page to alert page
		
	    System.out.println("Alert Text is--->"+alt.getText());
	 
	    alt.accept();
		
	    String myText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		System.out.println(myText);
	}

}
