package studyOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void myTest1()
  {
	  Reporter.log("myTest1 test method is running", true);
  }
  
  @Test
  public void myTest2()
  {
	  Reporter.log("myTest2 test method is running", true);
  }
  
  @BeforeMethod
  public void bf()
  {
	  Reporter.log("before method is running", true);
  }
  
  @AfterMethod
  public void af()
  {
	  Reporter.log("after method is running", true);
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("Before class is running", true);
  }
  
  @AfterClass
  public void Afterclass()
  {
	  Reporter.log("After class is running", true);
  }
  
  
}
