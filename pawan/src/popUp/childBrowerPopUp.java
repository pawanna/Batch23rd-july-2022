package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowerPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		 String mainPageID = driver.getWindowHandle();
		 
		 System.out.println(mainPageID);
		 //clicking on new window-----> will open child browser pop up
		 
		 driver.findElement(By.name("NewWindow")).click();
		 //getWindowHandles()------>return set of Ids
		 Set<String> allPageIds = driver.getWindowHandles();
		 //printing all elements from set
		 
		 for(String a:allPageIds)
		 {
			 System.out.println(a);
		 }
		 //using iterator ---->iterating through set
		 Iterator<String> it = allPageIds.iterator();
		 
		 String allPageIdnew = it.next();//moving to 1st element of set
		 
		 String chaildPageID = it.next();//moving to 2nd element of set
		 
		 
		 driver.switchTo().window(chaildPageID);//swithed selenium focus from main page to
		 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//driver.close();closes current focused page---->child window
		
		//driver.quit();closed all tabs/pages opened by selenium tool
		
		driver.findElement(By.id("the7-search")).sendKeys("good morning");//taking action on child page
		
		driver.close();
		
		//to work back to main page---->we need to change selenium 
		
		
		 
		 
		 
		
	}

}
