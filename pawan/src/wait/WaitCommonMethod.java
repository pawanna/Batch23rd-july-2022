package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitCommonMethod 
{
	public static void waitTest (WebDriver driver, int waitTime)
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}

}
