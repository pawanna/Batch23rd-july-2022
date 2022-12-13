package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserUsingArrayList {

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
		 
		 
		 ArrayList<String>al=new ArrayList<>(allPageIds);
		 
		  // String mainPageIDnew = al.get(0);
		  // String childpageID = al.get(1);
		   
		  // System.out.println(mainPageIDnew);
		   //System.out.println(childpageID);
		 
		 driver.switchTo().window(al.get(0));
		 driver.switchTo().window(al.get(1));
		 
		 
		 
		 			
		   
		   
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
