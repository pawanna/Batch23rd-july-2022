package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chrome driver
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//outer for loop for rows 
	    for(int i=1; i<=11; i++)
	    {
	    	//nested /inner for loop for columns ---->vary from 1-3
	        for(int j=1; j<=3; j++)
	    	 {
	    	if(i==1)
	    	{
	 
		String value = driver.findElement(By.xpath("//table[@id='product']//tr[ "+i+" ]/th[ "+j+"]")).getText();
		System.out.print(value+" || ");
	    	}
	    	else
	    	{
		String value = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
		System.out.print(value+" || ");
				
	         }
	             }
	    	 System.out.println();
	    }

      }
}

