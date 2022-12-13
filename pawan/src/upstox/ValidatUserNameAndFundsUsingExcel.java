package upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatUserNameAndFundsUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\0911_selinium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login-v2.upstox.com/");
			Thread.sleep(1000);
			
			 File myFile=new File("E:\\0911_selinium\\Book1.xlsx");
			 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet2");
			 String un = mysheet.getRow(0).getCell(0).getStringCellValue();
			 
				//login to application 
				//sending user id 
				driver.findElement(By.name("userId")).sendKeys(un);
				
				//sending password
				driver.findElement(By.name("password")).sendKeys( mysheet.getRow(0).getCell(1).getStringCellValue());
				
				//click on sign In button 
				driver.findElement(By.id("submit-btn")).click();
				
				//navigating to passcode page
				Thread.sleep(1000);
				driver.findElement(By.id("yob")).sendKeys( mysheet.getRow(0).getCell(2).getStringCellValue());
				
				//click on cancel trip (no i am good)
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
				
				//navigating to home page
				Thread.sleep(1000);
				
				//validate user name
				
				String expectedUN ="Pawan N.";
				String actualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
				
				if (expectedUN.equals(actualUN))
				{
					System.out.println("Actual and Expected usernames are matching, tc passed");
					
				}
				else
				{
					System.out.println("Actual and Expected usernames are matching, tc failed");
					
				}
				
				//validate funds 
				//clicking on funds button 
				driver.findElement(By.id("funds")).click();
				
				//time should be given 
				Thread.sleep(1000);
			   String funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
			   System.out.println("Funds available to trade is "+funds);
		   
		     

	}

}
