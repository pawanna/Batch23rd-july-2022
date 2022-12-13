package studyOfTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpstoxApplicationTest {
  @Test
  public void validateUserName() 
  {
	  Reporter.log("User name is validate", true);
  }
  @BeforeMethod
  public void loginToupstoxApp()
  {
	Reporter.log("Enter UN, Enter PWD, Enter Passcode And login to application", true);  
  }

  @AfterMethod
  public void logOutFromUpstoxApplication() 
  {
	  Reporter.log("Click on Logged out", true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("Launch browser and enter URL", true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("close browser", true);
  }

}
