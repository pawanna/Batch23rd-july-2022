package neoStoxTestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOM.NeoStoxPasswordpage;
import neoStoxPOM.NeoStoxSignLogin;

public class ValidateNeoStoxUserName extends Base
{
	NeoStoxSignLogin Login;
	NeoStoxPasswordpage password;
	
	
	@BeforeClass
	public void launchNeoStox()
	{
		launchBrowser();
		Login= new NeoStoxSignLogin(driver);
		password=new NeoStoxPasswordpage(driver);
		
	}
	
	
	
	
  @Test
  public void validateUserName() {
  }
}
